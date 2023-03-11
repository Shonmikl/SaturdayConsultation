package saturday.patterns.proxy;

public interface Reader {
    String read(String str);
}

class MyReader implements Reader{

    @Override
    public String read(String str) {
        return str + "!!!";
    }
}