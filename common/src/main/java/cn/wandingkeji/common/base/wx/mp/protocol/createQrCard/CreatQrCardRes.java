package cn.wandingkeji.common.base.wx.mp.protocol.createQrCard;

public class CreatQrCardRes {

    public CreatQrCardRes() {
    }

    private String errcode;
    private String errmsg;
    private String ticket;//获取的二维码ticket，凭借此ticket调用通过ticket换取二维码接口可以在有效时间内换取二维码
    private String url;//二维码图片解析后的地址，开发者可根据该地址自行生成需要的二维码图片
    private String show_qrcode_url;//二维码显示地址，点击后跳转二维码页面

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShow_qrcode_url() {
        return show_qrcode_url;
    }

    public void setShow_qrcode_url(String show_qrcode_url) {
        this.show_qrcode_url = show_qrcode_url;
    }

}
