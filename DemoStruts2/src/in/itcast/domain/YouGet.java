package in.itcast.domain;

/**
 * codening:utf-8
 *
 * @author :YouGetAction
 * @time :2019.08.09,13:12
 * @file :in.itcast.domain.YouGetAction.jave
 */
public class YouGet {
    private Integer start;
    private Integer end;
    private String prefix;
    private String suffix;

    public YouGet() {
    }

    public YouGet(Integer start, Integer end, String prefix, String suffix) {
        this.start = start;
        this.end = end;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return "YouGetAction{" +
                "start=" + start +
                ", end=" + end +
                ", prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                '}';
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
