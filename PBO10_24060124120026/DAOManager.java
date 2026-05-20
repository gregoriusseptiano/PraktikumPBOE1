/**
 * File         : DAOManager.java
 * Deskripsi    : pengelola DAO dalam program
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Rabu, 20 Mei 2026
 */

public class DAOManager {
    private PersonDAO personDAO; 

    public void setPersonDAO(PersonDAO person) {
        personDAO = person; 
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}