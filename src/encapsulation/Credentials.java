package encapsulation;

public class Credentials {
    private String username, password;


    public Credentials(String username, String password) {
        setPassword(password);
        setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (isStrongPassword(password))
            this.password = password;

    }
    public boolean isStrongPassword(String str){
        
        boolean isStrong = true;
        if (str.length() < 8) {
            System.out.println("Invalid");
            isStrong = false;
        }
        int letterCount = 0;
        int speCount = 0;
        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                letterCount++;
            } else if (!Character.isLetterOrDigit(str.charAt(i))) {
                speCount++;
            } else if ((Character.isDigit(str.charAt(i)))) {
                digitCount++;
            }

        }
        if (!(letterCount>0&&speCount>0&&digitCount>0)){
            System.out.println("Invalid");
            isStrong = false;
        }
        return isStrong;
    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}

/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */