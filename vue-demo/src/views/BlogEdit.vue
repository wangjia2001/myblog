<template>     
    <div id="poster">
      <el-form ref="editForm" status-icon :model="editForm" :rules="rules" label-width="80px">
        <el-form-item label="标题" prop="title">
          <el-input v-model="editForm.title"></el-input>
        </el-form-item>
        <el-form-item label="内容" prop="content">
          <mavon-editor v-model="editForm.content"/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm()">立即修改</el-button>
          <el-button @click="dialogFormVisible = false">取消</el-button>
        </el-form-item>
      </el-form>
    </div>
</template>

<script>
  import 'github-markdown-css/github-markdown.css' // 然后添加样式markdown-body
  export default {
    name: "BlogEdit",
    data() {
      return {
        dialogFormVisible: false,
        editForm: {
          id: '',
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
      const blogid = this.$route.params.id
      const _this = this
        this.$axios.get('/blog/' + blogid ).then((res) => {
          const blog = res.data
          _this.editForm.id = blog.id
          _this.editForm.title = blog.title
          _this.editForm.content = blog.content
        });
    },
    methods: {
      submitForm() {
        const blogid = this.$route.params.id
         const _this = this
         this.$axios
            .post('/blog/add', {
              id: blogid,
              title: this.editForm.title,
              content:this.editForm.content,
              date:new Date()
            }).then(resp => {
              if (resp && resp.status === 200) {
                this.dialogFormVisible = false
                 this.$message({
                  message:'修改成功',
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
  #poster {
    background:url("../assets/bg.jpg") no-repeat;
    background-position: center;
    height: 100%;
    width: 100%;
    background-size: cover;
    position: fixed;
  }
</style>