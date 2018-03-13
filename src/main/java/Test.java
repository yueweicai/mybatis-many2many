import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.orilore.mapper.NodeMapper;
import com.orilore.mapper.RuleMapper;
import com.orilore.model.Node;
import com.orilore.model.Rule;

public class Test {

	public static void main(String[] args) {
		try{
//			RuleMapper mapper = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("Configuration.xml")).openSession().getMapper(RuleMapper.class);
//		 	Rule rule = mapper.selectOne(4);	
//		 	System.out.println(rule.getRname());
//		 	System.out.println("-------------------------------------------");
//		 	List<Node> nodes = rule.getNodes();
//		 	for (Node node : nodes) {
//				System.out.println(node.getNname()+"\t"+node.getUrl());
//			}
			NodeMapper mapper = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("Configuration.xml")).openSession().getMapper(NodeMapper.class);
			Node node = mapper.selectOne(6);
			System.out.println(node.getNname());
			System.out.println("----------------------------------");
			List<Rule> rules = node.getRules();
			for (Rule rule : rules) {
				System.out.println(rule.getRname());
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
