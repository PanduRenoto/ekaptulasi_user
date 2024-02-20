package enkapitulasi_user;

public class Enkapitulasi_user {

    public static void main(String[] args) {
        user gunnakam = new user("hahah", "hahay", 0, false);
        
        gunnakam.setUsername("gunnakam");
        gunnakam.setPassword("kelakuanRor");
        gunnakam.setId(1);
        gunnakam.setStatus(false);
        
        System.out.println("Username: " + gunnakam.getUsername());
        System.out.println("Password: " + gunnakam.getPassword());
        System.out.println("ID: " + gunnakam.getId());
        System.out.println("Status: " + gunnakam.getStatusAsString());
    }    
}
