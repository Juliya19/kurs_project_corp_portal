package by.bsuir.ief.rest.dao;

import by.bsuir.ief.rest.model.entity.Country;
import by.bsuir.ief.rest.model.exception.badexception.BadAddEntityException;
import by.bsuir.ief.rest.model.exception.badexception.BadDeleteEntityException;
import by.bsuir.ief.rest.model.exception.badexception.BadGetEntityException;
import by.bsuir.ief.rest.model.exception.badexception.BadUpdateException;
import by.bsuir.ief.rest.model.exception.notfoundexception.AllEntityNotFountException;
import by.bsuir.ief.rest.model.exception.notfoundexception.EntityNotFoundByIdException;
import by.bsuir.ief.rest.model.service.CountryService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by andrey on 02.05.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/dbunit.xml")
public class DBCountryTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CountryService service;

    private Country country = null;

    private Country test ;

    private static int find_id = 0;

    @Before
    public void init() throws BadGetEntityException, EntityNotFoundByIdException {
        country = new Country();
        country.setCountryName("root");
        country.setIdCountryt(0);
        country.setKeyPhone("56458");
        country.setShortCountryName("ro");

        find_id = 1;

        test = service.read(find_id);
    }

    @Test
    public void createTest() throws BadAddEntityException {
        Country add = service.add(country);
        assertNotNull(add);
    }

    @Test
    public void readAllTest() throws BadGetEntityException, AllEntityNotFountException {
        List<Country> list = service.read();
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    @Test
    public void readById()
    {
        Country o = null;
        try {
            o = service.read(find_id);
        } catch (EntityNotFoundByIdException | BadGetEntityException e) {
            e.printStackTrace();
        }
        assertNotNull(o);
    }

    @Test
    public void updateEntity() throws BadGetEntityException, EntityNotFoundByIdException, CloneNotSupportedException, BadUpdateException {
        Country o = service.read(find_id);
        Country clone = (Country) o.clone();
        o.setCountryName("robyn good");
        o = service.update(o);
        assertTrue(o.hashCode() != clone.hashCode());
    }

    @Test
    public void deleteEntityById() throws EntityNotFoundByIdException, BadDeleteEntityException {
        boolean delete = service.delete(1);
        assertTrue("good delete!",delete);
    }
}
