package cn.enn.ygego.sunny.user.controller.channelManage;


import cn.enn.ygego.sunny.core.web.JsonResult;
import cn.enn.ygego.sunny.core.web.json.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channelMan")
@Api(value = "添加渠道管理", description = "添加渠道管理")
public class ChannelManageController {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("创建渠道接口")
    @RequestMapping(value = "/createChannel", method = { RequestMethod.POST})
    public JsonResponse createChannelManInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("修改渠道接口")
    @RequestMapping(value = "/modifyChannel", method = { RequestMethod.POST})
    public JsonResponse modifyChannelManInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查询渠道详情的接口")
    @RequestMapping(value = "/queryChannel", method = { RequestMethod.POST})
    public JsonResponse queryChannelManInfo(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ApiOperation("查看渠道列表接口")
    @RequestMapping(value = "/queryChannelList", method = { RequestMethod.POST})
    public JsonResponse queryChannelManList(@RequestBody JsonResult jsonRequest) {
        JsonResponse jsonResponse = new JsonResponse(); // 返回的对象
        return jsonResponse;
    }
}
