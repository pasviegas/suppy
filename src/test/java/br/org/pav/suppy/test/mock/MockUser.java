package br.org.pav.suppy.test.mock;

import br.org.pav.suppy.model.User;
import br.org.pav.suppy.repository.Users;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MockUser implements InitializingBean, DisposableBean {

    @Autowired
    private Users users;

    @Override
    public void afterPropertiesSet() throws Exception {


        users.store(getUser1());
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub

    }

    public static User getUser1() {
        User user = new User();
        user.setId("1");
        user.setName("Pedro");

        return user;
    }

    public static User getUser2() {
        User user = new User();
        user.setId("2");
        user.setName("Joao");

        return user;
    }

}
