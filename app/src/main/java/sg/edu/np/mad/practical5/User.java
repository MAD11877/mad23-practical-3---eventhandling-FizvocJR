package sg.edu.np.mad.practical5;

public class User {
    String Name;
    String Description;
    int Id;
    boolean Followed;

    public User() {
    }

    public User(String name, String description, int id, boolean followed) {
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }
}