package storage.database;

public interface DatabaseStorage {

    public void loadData();
    public void saveData();
    public void updateData();
    public void removeData();
    public void clearData();
}
