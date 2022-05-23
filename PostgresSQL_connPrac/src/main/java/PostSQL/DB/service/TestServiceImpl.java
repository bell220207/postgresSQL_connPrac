package PostSQL.DB.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import PostSQL.DB.command.TestVO;
import PostSQL.DB.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestMapper testMapper;
	
	@Override
	public boolean regist(TestVO vo) {
		return testMapper.regist(vo);
	}

}
