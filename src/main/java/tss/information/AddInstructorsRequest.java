package tss.information;

import java.util.List;
import java.util.Set;

public class AddInstructorsRequest {
    private String cid;
    private Set<String> uids;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Set<String> getUids() {
        return uids;
    }

    public void setUids(Set<String> uids) {
        this.uids = uids;
    }
}
