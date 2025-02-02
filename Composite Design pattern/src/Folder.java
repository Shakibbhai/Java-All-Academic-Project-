import java.util.ArrayList;
import java.util.List;
class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching in Folder: " + name);
        for (FileSystemComponent component : components) {
            component.search(keyword);
        }
    }

    public String getName() {
        return name;
    }
}
