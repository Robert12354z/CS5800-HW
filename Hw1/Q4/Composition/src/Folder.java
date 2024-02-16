import java.util.ArrayList;

public class Folder {

    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> folders;

    
    

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String fileName) {
        this.folderName = fileName;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }

    public void addFolder(Folder folder){
        folders.add(folder);
    }

    public void addFile(File file){
        this.files.add(file);
    }

    public void printTree(){
        System.out.println(this.folderName);

        if(this.folders.size() > 0 ){
            System.out.println("/");
            for(int i = 0; i<folders.size(); i++){

                Folder f = folders.get(i);

                if(f.getFolders().size() > 0){
                    f.printTree();
                }
                else{
                    System.out.println(f.getFolderName());
                }

            }
        }

    }
        
    
    
}
