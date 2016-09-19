package module05;

public class DAOImpl implements DAO{
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " saved to DB.");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " delete from DB.");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " update DB.");
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println(id + " room was found." );
        return null;
    }

}
