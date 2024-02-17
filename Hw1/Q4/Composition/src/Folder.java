import java.util.ArrayList;

public class Folder {

    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> folders;
    private String indent;
    
    

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

        if(this.folders.size() > 0 ){
            indent = " ";
            System.out.println(indent + this.folderName);
            for(int i = 0; i<folders.size(); i++){

                Folder f = folders.get(i);

                indent = "  ";

                System.out.println(indent+ f.getFolderName());            

                if(f.getFolders().size() > 0){
                    for(int j = 0; j<f.getFolders().size(); j++ ){

                        indent = "    ";

                        System.out.println(indent + f.getFolders().get(j).getFolderName());

                        if (f.getFolders().get(j).getFolders().size() > 0 ){

                            for(int z = 0; z<f.getFolders().get(j).getFolders().size(); z++ ){
                                indent = "      ";
                                System.out.println(indent + f.getFolders().get(j).getFolders().get(z).getFolderName());
                            }
                            
                            


                        }

                       
                    }
                }

                if (f.getFiles().size() > 0) {
                    for(int j =0; j<f.getFiles().size(); j++){

                        indent = "    ";
                        System.out.println(indent + f.getFiles().get(j).getFileName());

                    }

                }

        }
    }
}
}

        
    
    

