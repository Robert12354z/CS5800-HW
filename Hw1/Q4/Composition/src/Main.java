import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        
        String demoName = "demo1";

        Folder demo1 = new Folder(demoName);

        ArrayList<Folder> folderList = new ArrayList<Folder>();
        ArrayList<File> filesList = new ArrayList<File>();

        demo1.setFolders(folderList);
        demo1.setFiles(filesList);
        
        Scanner scan = new Scanner(System.in);

        char ch = 'A';

        boolean whi = true;

        
        while(whi == true){
            switch(ch){
                case 'A':

                    System.out.println("Primary Filename: "+ demo1.getFolderName());
                    System.out.println("Select option from list: ");
                    System.out.println("Option B: Add Folder");
                    System.out.println("Option C: Delete a Folder");
                    System.out.println("Option D: Add File");
                    System.out.println("Option E: Print Out File Structure");
                    System.out.println("Option F: Close Program");
            
                    ch = scan.nextLine().charAt(0); 
                break;

                case 'B':
                    System.out.println("What is the name of your Folder? Name: ");
                    String folderName = scan.nextLine();
                    Folder folder1 = new Folder(folderName);

                    ArrayList<Folder> folderList2 = new ArrayList<Folder>();
                    ArrayList<File> filesList2 = new ArrayList<File>();

                    folder1.setFolders(folderList2);
                    folder1.setFiles(filesList2);


                    System.out.println("Where would you like to stick this folder? Name: ");
                    String fileLocation = scan.nextLine();


                    if (fileLocation.equals(demoName) == true){
                        demo1.addFolder(folder1);
                        System.out.println(demo1.getFolders().size());
                        ch = 'A';
                        
                        break;
                    }
                    else if(fileLocation != demo1.getFolderName()){
                        for(int i=0; i< demo1.getFolders().size(); i++){
                            Folder folder2 = demo1.getFolders().get(i);
                            if (folder2.getFolderName().equals(fileLocation) == true){
                                folder2.addFolder(folder1);

                            }
                            else{
                                for(int j=0; j< folder2.getFolders().size(); j++){
                                    Folder folder3 = folder2.getFolders().get(j);
                                    if (folder3.getFolderName().equals(fileLocation) == true){
                                        folder3.addFolder(folder1);
                                }
                            }
                        }
                        ch = 'A';

                    }
                }
                    else{
                        break;
                    }
                    
                
                break;
                
                case 'C':
                    System.out.println("Which folder do you want to delete? Name: ");
                    String folderNameC = scan.nextLine();    

                    for(int i=0; i< demo1.getFolders().size(); i++){
                        Folder folder5 = demo1.getFolders().get(i);
                        if (folder5.getFolderName().equals(folderNameC)){
                            demo1.getFolders().remove(folder5);
                        }
                        else{
                            for(int j = 0; j < folder5.getFolders().size(); j++){

                                Folder folder6 = folder5.getFolders().get(j);
                                if (folder6.getFolderName().equals(folderNameC)){
                                    folder5.getFolders().remove(folder6);
                                }

                            }
                        }
                    }
                    ch = 'A';

                break;

                case 'D':
                    
                    System.out.println("What is the name of your file? Name: ");
                    String fileName = scan.nextLine();
                    File file1 = new File(fileName);

                    System.out.println("Where would you like to stick this file? Name: ");
                    String fileLocation1 = scan.nextLine();

                    if (fileLocation1 == demo1.getFolderName()){
                        demo1.addFile(file1);
                        ch = 'A';
                    }
                    else if(fileLocation1 != demo1.getFolderName()){
                        for(int i=0; i< demo1.getFolders().size(); i++){
                            Folder folder2 = demo1.getFolders().get(i);
                            if (folder2.getFolderName().equals(fileLocation1) == true){
                                folder2.addFile(file1);

                            }
                            else{
                               
                            }
                        ch = 'A';
                            }
                        }
                    
                    else{
                        break;
                    }
                break;

                case 'E':
                    demo1.printTree();
                    ch = 'A';
                break;

                case 'F':
                    whi = false;
                break;

                    



            }
        }





        




    }
}
