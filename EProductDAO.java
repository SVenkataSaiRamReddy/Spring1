package com.ecommerce.dao;


	@Repository
	public class EProductDAO {

	        @Autowired
	    private SessionFactory sessionFactory;

	        @SuppressWarnings("unchecked")
	        public List<EProductEntity> getAllProducts() {
	                return this.sessionFactory.getCurrentSession().createQuery("from EProducts").list();
	        }
	}


}
