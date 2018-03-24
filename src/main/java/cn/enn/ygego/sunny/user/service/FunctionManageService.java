package cn.enn.ygego.sunny.user.service;

import java.util.List;
import cn.enn.ygego.sunny.user.model.FunctionManage;

/**
 * dal Interface:FunctionManage
 * @author gencode
 * @date 2018-3-22
 */
public interface FunctionManageService {

    public List<FunctionManage> findAll();

    public List<FunctionManage> findFunctionManages(FunctionManage record);

    public FunctionManage getFunctionManageByPrimaryKey(Long functionId);

    public Integer createFunctionManage(FunctionManage record);

    public Integer removeFunctionManage(FunctionManage record);

    public Integer removeByPrimaryKey(Long functionId);

    public Integer modifyFunctionManageByPrimaryKey(FunctionManage record);



}