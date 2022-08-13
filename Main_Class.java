imoprt java.util.Scanner;
Public class Main_Class{
    public static void main(String[] args){
        String mainManudfact;
        String mainModel;
        double mainPrice;
        System.out.print("Enter the name of the manufacturer of the cell phone: ");
        Scanner input=new Scanner(System.in);
        mainManufact=input.nextLine();
        System.out.print("Enter the model of the cell phone: ");
        mainModel=input.nextLine();
        System.out.print("Enter the price of the cell phone: ");
        mainPrice=input.nextDouble();

        Cell_Phone_Class cellPhone=new Cell_Phone_Class();
    }
}