<template>
  <div>
    <h4 class="lighter">
      <i class="ace-icon fa fa-hand-o-right icon-animated-hand-pointer blue"></i>
      <router-link to="/business/course" class="pink"> {{ course.name }}</router-link>
    </h4>
    <hr>
    <p>
      <router-link to="/business/course" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-arrow-left"></i>
        返回课程
      </router-link>
      &nbsp;
      <button v-on:click="add()" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-edit"></i>
        新增
      </button>
      &nbsp;
      <button v-on:click="list({page:1})" class="btn btn-white btn-default btn-round">
        <i class="ace-icon fa fa-refresh"></i>
        刷新
      </button>
    </p>

    <pagination ref="pagination" v-bind:list="list" v-bind:itemCount="8"></pagination>

    <table id="simple-table" class="table  table-bordered table-hover">
      <thead>
      <tr>
        <th>ID</th>
        <th>名称</th>
        <th>操作</th>
      </tr>
      </thead>

      <tbody>
      <tr v-for="chapter in chapters">
        <td>{{ chapter.courseId }}</td>
        <td>{{ chapter.name }}</td>
        <td>
          <div class="hidden-sm hidden-xs btn-group">
            <button class="btn btn-white btn-xs btn-info btn-round">
              小节
            </button>&nbsp;
            <button class="btn btn-white btn-xs btn-info btn-round">
              编辑
            </button>&nbsp;
            <button class="btn btn-white btn-xs btn-warning btn-round">
              删除
            </button>
          </div>
        </td>
      </tr>
      </tbody>
    </table>

    <div id="form-modal" class="modal fade" tabindex="-1" role="dialog">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">表单</h4>
          </div>
          <div class="modal-body">
            <form class="form-horizontal">
              <div class="form-group">
                <label class="col-sm-2 control-label">名称</label>
                <div class="col-sm-10">
                  <input v-model="chapter.name" class="form-control" placeholder="名称">
                </div>
              </div>
              <div class="form-group">
                <label class="col-sm-2 control-label">课程id</label>
                <div class="col-sm-10">
                  <input v-model="chapter.courseId" class="form-control" placeholder="名称">
                </div>
              </div>
<!--              <div class="form-group">-->
<!--                <label class="col-sm-2 control-label">课程</label>-->
<!--                <div class="col-sm-10">-->
<!--                  <p class="form-control-static">{{ course.name }}</p>-->
<!--                </div>-->
<!--              </div>-->
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button v-on:click="save()" type="button" class="btn btn-primary">保存</button>
          </div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
  </div>
</template>

<script>
import Pagination from "../../components/pagination";
export default {
  components: {Pagination},
  name: "chapter",
  data: function () {
    return {
      chapter: {},
      chapters: [],
      course: {},
    }
  },
  methods:{
    /**
     * 点击【新增】
     */
    add() {
      this.chapter = {};
      $("#form-modal").modal("show");
    },
    list(data){
      data={
        page: data.page,
        size: this.$refs.pagination.size
      }
      this.$ajax.post('http://127.0.0.1:9000/business/admin/chapter/searchByPage',data).then((response)=>{
        response = response.data;
        this.chapters = response.data.list;
        this.$refs.pagination.render(data.page, response.data.total);
      })
    },
    save() {
      this.$ajax.post('http://127.0.0.1:9000/business/admin/chapter/save',this.chapter).then((response)=>{
        console.log("保存大章列表结果：", response);
        if (response.data.success) {
          $("#form-modal").modal("hide");
          this.list(1);
        }
      })
    }
  },
  mounted() {
    this.list({page:1});
  }
}
</script>