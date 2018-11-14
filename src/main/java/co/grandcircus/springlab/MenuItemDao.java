package co.grandcircus.springlab;

import java.awt.MenuItem;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
@Transactional
public class MenuItemDao {
	
@PersistenceContext
private EntityManager em;

public List<MenuItems> findAll()
{

    return em.createQuery("From MenuItems",MenuItems.class).getResultList();
}

public MenuItems findById(Long id) {
	return em.find(MenuItems.class, id);
}
public void create(MenuItems menu_item) {
	em.persist(menu_item);
}

public void update(MenuItems menu_item) {
	em.merge(menu_item);
}
public void delete(Long id) {
	// Deleting with Hibernate entity manager requires fetching a reference first.
	MenuItem menu_item = em.getReference(MenuItem.class, id);
	em.remove(menu_item);
}
}