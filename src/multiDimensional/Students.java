package multiDimensional;

public class Students {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};


        String[][] batch25Groups = {batch25Group1,batch25Group2,batch25Group3};


        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = {batch24Group1,batch24Group2,batch24Group3};

        String[][][] cydeoStudents = {batch25Groups,batch24Groups};

        for (int i = 0; i < cydeoStudents.length; i++) {
            for (int j = 0; j < cydeoStudents[i].length; j++) {
                for (int k = 0; k < cydeoStudents[i][j].length; k++) {
                    System.out.print(cydeoStudents[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("----------------");
        for (String[][] cydeoStudent : cydeoStudents) {
            for (String[] strings : cydeoStudent) {
                for (String string : strings) {
                    System.out.print(string + "\t");
                }
                System.out.println();
            }
        }

    }
}
