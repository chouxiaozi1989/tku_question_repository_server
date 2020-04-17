package com.ojs.question_repository.utils;

//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class MyGenerator {
//    /**
//     * oracle
//     *
//     * @param packageName
//     * @param tableNames
//     */
//    private static void generateByOracleTables(String packageName, String... tableNames) {
//        GlobalConfig config = new GlobalConfig();
//        String dbUrl = "数据库地址";
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.ORACLE)
//                .setUrl(dbUrl)
//                .setUsername("用户名")
//                .setPassword("密码")
//                .setDriverName("oracle.jdbc.driver.OracleDriver");
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig
//                .setCapitalMode(true)//驼峰命名
//                .setEntityLombokModel(true)//使用lombk
//                .setRestControllerStyle(true)
//                .setNaming(NamingStrategy.underline_to_camel)
//                .setSuperEntityClass("com.example.common.SuperEntity")
//                .setSuperMapperClass("com.example.common.SuperMapper")
//                .setSuperControllerClass("com.example.common.SuperController")
//                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
//
//        config.setActiveRecord(false)
//                .setAuthor("作者名")
//                .setOutputDir("生成文件导出地址")
//                .setEnableCache(false)
//                .setBaseColumnList(true)
//                .setBaseResultMap(true)
//                .setFileOverride(true);
//
//        new AutoGenerator().setGlobalConfig(config)
//                .setDataSource(dataSourceConfig)
//                .setStrategy(strategyConfig)
//                .setPackageInfo(
//                        new PackageConfig()
//                                .setParent(packageName)
//                                .setController("controller")
//                                .setService("service")
//                                .setServiceImpl("serviceImp")
//                                .setEntity("model")
//                ).execute();
//
//    }
//
//    /**
//     * mysql
//     */
//    private static void generateByTables(String packageName, String[] tableNames) {
//        GlobalConfig config = new GlobalConfig();
//        String dbUrl = "jdbc:mysql://10.1.10.236:3306/ojs";
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.MYSQL)
//                .setUrl(dbUrl)
//                .setUsername("root")
//                .setPassword("sa")
//                .setDriverName("com.mysql.cj.jdbc.Driver");
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig
//                .setCapitalMode(true)
//                .setEntityLombokModel(true)
//                .setNaming(NamingStrategy.underline_to_camel)
//                .setInclude(tableNames)
//                .setEntitySerialVersionUID(false);
//        config.setActiveRecord(false)
//                .setAuthor("CaiYi")
//                .setOutputDir(System.getProperty("user.dir") + "/src/main/java")
//                .setFileOverride(true)
//                .setOpen(false)
//                .setBaseResultMap(true)
//                .setBaseColumnList(true);
//        new AutoGenerator().setGlobalConfig(config)
//                .setDataSource(dataSourceConfig)
//                .setStrategy(strategyConfig)
//                .setPackageInfo(
//                        new PackageConfig()
//                                .setParent(packageName)
//                                .setController("controller")
//                                .setService("service")
//                                .setServiceImpl("serviceImp")
//                                .setEntity("model")
//                ).execute();
//    }
//
//    public static void main(String[] args) {
//        String packageName = "com.ojs.question_repository";
//        String[] tabs = {
//                "attachment", "biz_log", "checkpoints", "knowledgepoinproblemsrelation", "knowledgepoint", "languages", "outline", "paper_checkpoints", "paper_p_kp_relation", "paper_points", "paper_problemsattach", "paper_problemschoices", "paper_problemsinfo", "paper_solutions", "paper_topicinfo", "paperinfo", "papermakemission", "paperstrategy", "paperstrategy_points", "paperstrategy_problems", "problemcategories", "problemsattach", "problemschoices", "problemsinfo", "solutions", "submissions", "systemcode", "systempara", "topicinfo", "workbook", "workbook_problem_rela"
//        };
//        generateByTables(packageName, tabs);
//    }
}
