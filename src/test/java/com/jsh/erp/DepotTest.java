package com.jsh.erp;

import com.alibaba.fastjson.JSON;
import com.jsh.erp.datasource.entities.Depot;
import com.jsh.erp.service.depot.DepotService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepotTest {
	
	private Logger logger = LoggerFactory.getLogger(DepotTest.class);

    @Resource
    private DepotService depotService;

    @Test
    public void getDepot() throws Exception{
        Depot result = depotService.getDepot(1l);
        logger.info("depot result:" + JSON.toJSONString(result));
    }

    @Test
    public void getAllList() throws Exception{
        List<Depot> depotList =depotService.getAllList();
        logger.info("depot result:" + JSON.toJSONString(depotList));
    }


}
