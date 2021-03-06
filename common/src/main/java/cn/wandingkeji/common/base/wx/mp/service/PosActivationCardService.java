package cn.wandingkeji.common.base.wx.mp.service;

import cn.wandingkeji.common.base.wx.mp.protocol.activation.OneButtonActivationReq;
import cn.wandingkeji.common.base.wx.mp.util.BaseAPIService;
import cn.wandingkeji.common.base.wx.mp.util.WeiXinConstant;


/*
 * add by ws 0512
 * 一键激活
 */
public class PosActivationCardService extends BaseAPIService {

    public PosActivationCardService(String access_token) {
        super(WeiXinConstant.WX_ONEBUTTON_ACTIVATION_CARD + access_token);
        // TODO Auto-generated constructor stub
    }

    /**
     * 请求一键激活会员卡服务
     *
     * @param CreatCardReq 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的JSON数据
     */
    public String request(OneButtonActivationReq activationCardReq) {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        String responseString = sendPost(activationCardReq);

        return responseString;
    }

}
