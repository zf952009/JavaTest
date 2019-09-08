package in.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import in.itcast.domain.YouGet;

/**
 * codening:utf-8
 *
 * @author :YouGetAction
 * @time :2019.08.09,13:06
 * @file :in.itcast.action.YouGetAction.jave
 */
public class YouGetAction extends ActionSupport implements ModelDriven<YouGet> {
    private YouGet youGet = new YouGet();

    public String form() throws Exception {

        Integer start = youGet.getStart();
        Integer end = youGet.getEnd();
        StringBuffer stringBuffer = new StringBuffer().append("you-get ");
        if (start <= 0 || start == null) {
            start = 1;
        }
        if (end <= 0 || end == null) {
            return SUCCESS;
        }
        for (; start <= end; start++) {
            stringBuffer.append(youGet.getPrefix() + start + youGet.getSuffix() + " ");
        }
        System.out.println(youGet);
        System.out.println(stringBuffer.toString());
        ActionContext.getContext().put("message", stringBuffer.toString());
        return SUCCESS;
    }


    @Override
    public YouGet getModel() {
        return youGet;
    }
}
