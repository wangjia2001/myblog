<template>     
    <div id="building" >
      <el-form ref="editForm" status-icon :model="editForm" :rules="rules" label-width="80px">
        <el-form-item label="标题" prop="title">
          <el-input v-model="editForm.title"></el-input>
        </el-form-item>
        <el-form-item label="内容" prop="content">
          <mavon-editor v-model="editForm.content"/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm()">立即创建</el-button>
          <el-button @click="dialogFormVisible = false">取消</el-button>
        </el-form-item>
      </el-form>
    </div>
</template>
<script>
  

  export default {
    name: "BlogEdit",
    data() {
      return {
        dialogFormVisible: false,
        editForm: {
          id: null,
          title: '',
          content: ''
        },
         
        rules: {
          title: [
            {required: true, message: '请输入标题', trigger: 'blur'},
            {min: 3, max: 50, message: '长度在 3 到 50 个字符', trigger: 'blur'}
          ]
        }
      }
    },
    created() {
      const blogId = this.$route.params.id
      const _this = this
      if(blogId) {
        this.$axios.get('/blog/' + blogId).then((res) => {
          const blog = res.data.data
          _this.editForm.id = blog.id
          _this.editForm.title = blog.title
          _this.editForm.content = blog.content
        });
      }
    },
    methods: {
      submitForm() {
        const _this = this
         this.$axios
            .post('/blog/add', {
              id: this.editForm.id,
              title: this.editForm.title,
              content:this.editForm.content,
              date:new Date()
            }).then(resp => {
              if (resp && resp.status === 200) {
                this.dialogFormVisible = false
                this.$message({
                  message:'添加成功',
                  type:'success'
                });
             this.$router.push('/blog');    
              }
            }) 
      }
          }
        
  }
</script>

<style scoped>
#building{
background:url("../assets/bg.jpg") no-repeat;
width:100%;
height:100%;
position:fixed;
background-size:100% 100%;
}
</style>