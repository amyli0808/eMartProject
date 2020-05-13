package com.admin.test;
import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.admin.entity.*;
import com.admin.service.*;
import junit.framework.TestCase;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AdminControllerTest extends TestCase {
    @Autowired
    private UserService service;
    @Autowired
    private MockMvc mvc;
    public void setUp() throws Exception {
        super.setUp();
    }
    public void tearDown() throws Exception {
    }
    @Test
    public void getManufacturerListShouldReturnDetails()
            throws Exception {
        this.mvc.perform(get("/api/user")).andExpect(status().isOk());
        List<UserEntity> userEntityList = this.service.findAllUsers();
        for(int nIndex=0;nIndex <userEntityList.size();nIndex++)
        {
            assertThat(userEntityList.get(nIndex).getId()).isEqualTo(nIndex+1);
        }
    }
}

