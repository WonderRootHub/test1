package com.dk.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("echarts")
public class EchartsController {

    @RequestMapping("toEcharts")
    public String toEcharts(){
        return "echarts_demo";
    }

    @RequestMapping("getData")
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>();
        String[] type = {"张","王","李","赵","周","吴","郑","王"};
        int[] data = {5,7,45,36,26,18,20,23};
        int[] data2 = {54,73,40,10,30,90,51,45};
        map.put("type",type);
        map.put("data",data);
        map.put("data2",data2);
        return map;
    }
}
