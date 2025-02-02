class File implements FileSystemComponent {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword found in File: " + name);
        } else {
            System.out.println("Keyword not found in File: " + name);
        }
    }

    public String getName() {
        return name;
    }
}


