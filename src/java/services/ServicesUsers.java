package services;

import business.User;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

public class ServicesUsers {
    
    protected static EntityManager em;
    
    public ServicesUsers(EntityManager p_em) {
        this.em = p_em;
    }
    
    public List<User> selectAll() {
        return (List<User>) 
                em.createNativeQuery("SELECT Numero,Username,email,pwd, dateReceptionBon FROM Users", 
                        business.User.class).getResultList();
    }
    
    public User selectById(Long p_id) {
        return em.find(business.User.class, p_id);
    }
    
    public User select(String p_username) {
        return (User) 
                em.createNativeQuery("SELECT NUMERO, PWD, EMAIL, DATERECEPTIONBON, NIVEAU FROM Users WHERE Username = '" + p_username + "'", 
                        business.User.class).getResultList();
    }
    
    public void create(String username, String pwd, String email, Date daterecept, String niveau) {
        User user_create = new User(username, pwd, email, daterecept, niveau);
        em.getTransaction().begin();
        em.persist(user_create);
        em.getTransaction().commit();
    }
    
    public void update(User u) {
        User user_update = selectById(u.getId());
        em.getTransaction().begin();
        user_update.setPwd(u.getPwd());
        em.getTransaction().commit();
    }
    
    public void delete(Long id) {
        User user_delete = selectById(id);
        if (user_delete != null) {
            em.getTransaction().begin();
            em.remove(user_delete);
            em.getTransaction().commit();
        }
    }
    
}
