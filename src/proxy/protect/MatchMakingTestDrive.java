package proxy.protect;


import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }
    public void drive() {
        PersonBean joe = new PersonBeanImpl("joe", "male", "coding", 0, 0);

        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println(ownerProxy.getName());
        ownerProxy.setInterests("bowling");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println(ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println(ownerProxy.getName());
        nonOwnerProxy.setHotOrNotRating(10);
        try {
            nonOwnerProxy.setInterests("coding");
        } catch (Exception e) {
            System.out.println("Can't set interests from nonOwner proxy");
        }
        System.out.println(ownerProxy.getInterests());
    }
    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
