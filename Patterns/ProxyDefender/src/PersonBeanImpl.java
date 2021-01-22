import java.lang.reflect.Proxy;

public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getGender() {
        return null;
    }

    @Override
    public String getInterests() {
        return null;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0) return 0;
        return rating/ratingCount;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setGender(String gender) {

    }

    @Override
    public void setInterests(String interests) {

    }

    @Override
    public void setHotOrNotRating(int rating) {
this.rating+=rating;
ratingCount++;
    }
    PersonBean getOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }
    PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
