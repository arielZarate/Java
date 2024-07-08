package JDBC_PSTMT_WITH_DAO_DTO_V3.Capa_Datos;

public class UserDTO {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private String email;

    public UserDTO() {}

    public UserDTO( String name, String lastName, int age, String email) {
        //el id no va nunca lo generas solo la bd
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }




    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }





    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
