package by.bsuir.ief.rest.dao;

import by.bsuir.ief.rest.model.entity.Calendar;

import java.util.List;

/**
 * Created by andrey on 08.04.2016.
 */
public interface CalendarDAO {
    /**
     *
     * @param createUser
     * @return
     * @throws Exception
     */
    Calendar create(Calendar createUser) throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    List<Calendar> read() throws Exception;

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    Calendar read(int id) throws Exception;

    /**
     *
     * @param person
     * @return
     * @throws Exception
     */
    Calendar update(Calendar person)throws Exception;

    /**
     *
     * @param id
     * @throws Exception
     */
    boolean delete(int id) throws Exception;


}
