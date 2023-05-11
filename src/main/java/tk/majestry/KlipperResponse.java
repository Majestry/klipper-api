package tk.majestry;

public class KlipperResponse
{

    private String name;

    private String version;

    private String headerValue;

    public String getHeaderValue()
    {
        return headerValue;
    }

    public void setHeaderValue(String headerValue)
    {
        this.headerValue = headerValue;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return String.format("Name: %s%nVersion: %s%nCustomHeader: %s%n", name, version, headerValue);
    }
}
