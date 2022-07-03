public class Customer {
    private String custId;
    private String custname;
    private String city;
    public Customer() {
    }
    public Customer(String custId, String custname, String city) {
        this.custId = custId;
        this.custname = custname;
        this.city = city;
    }
    public String getCustId() {
        return custId;
    }
    public void setCustId(String custId) {
        this.custId = custId;
    }
    public String getCustname() {
        return custname;
    }
    public void setCustname(String custname) {
        this.custname = custname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((custId == null) ? 0 : custId.hashCode());
        result = prime * result + ((custname == null) ? 0 : custname.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (custId == null) {
            if (other.custId != null)
                return false;
        } else if (!custId.equals(other.custId))
            return false;
        if (custname == null) {
            if (other.custname != null)
                return false;
        } else if (!custname.equals(other.custname))
            return false;
        return true;
    }
        
}
