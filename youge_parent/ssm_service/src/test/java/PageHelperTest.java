import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext*.xml"})
public class PageHelperTest {

//
//   @Autowired
//   private ProductService productService;
//
//
//   @Test
//   public void testPageHelper() throws Exception {
//       // 查询全部必须紧跟在PageHelper.startPage之后作为其后的第一个select查询
//       PageHelper.startPage(1,5);
//       List<Product> productList = productService.queryProductList();
//       // 此处的PageInfo等同于我们的PageBean，只需要把查询全部出来的list集合作为构造参数传入
//       PageInfo<Product> pageInfo = new PageInfo<>(productList);
//
//       // 获取当前页的数据
//       List<Product> pageList =  pageInfo.getList();
//       System.out.println("总条数：" + pageInfo.getTotal());
//       System.out.println("总页数：" + pageInfo.getPages());
//       System.out.println("当前页：" + pageInfo.getPageNum());
//       System.out.println("每页显示条数：" + pageInfo.getPageSize());
//       System.out.println("上一页：" + pageInfo.getPrePage());
//       System.out.println("下一页：" + pageInfo.getNextPage());
//
//       if(pageList != null && pageList.size() > 0) {
//           for (int i = 0; i < pageList.size(); i++) {
//               Product product =  pageList.get(i);
//               System.out.println(product);
//           }
//       }
//   }




}
