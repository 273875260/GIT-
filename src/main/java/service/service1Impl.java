package service;

import mapper.XxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Xx;
import com.service.service1;

import java.util.List;

/**
 * @author xxx
 * @date 2019/7/10 22:48
 * @description
 */
@Service("service1")
public class service1Impl implements service1 {
    @Autowired
    private XxMapper xxMapper;

    public List<Xx> findxx() {

        return xxMapper.findxx();
    }

    ;
}
