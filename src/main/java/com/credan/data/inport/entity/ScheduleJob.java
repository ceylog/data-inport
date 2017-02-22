package com.credan.data.inport.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "schedule_job")
public class ScheduleJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 任务id
     */
    @Column(name = "job_id")
    private String jobId;

    /**
     * 任务名称
     */
    @Column(name = "job_name")
    private String jobName;

    /**
     * 任务分组，任务名称+组名称应该是唯一的
     */
    @Column(name = "job_group")
    private String jobGroup;

    /**
     * 任务初始状态 0禁用 1暂停 2运行中
     */
    @Column(name = "job_status")
    private String jobStatus;

    /**
     * 任务是否有状态（并发）
     */
    @Column(name = "is_concurrent")
    private String isConcurrent;

    /**
     * 任务运行时间表达式
     */
    @Column(name = "cron_expression")
    private String cronExpression;

    /**
     * 任务描述
     */
    private String description;

    /**
     * 任务调用类在spring中注册的bean id，如果spingId不为空，则按springId查找
     */
    @Column(name = "spring_id")
    private String springId;

    /**
     * 任务调用类名，包名+类名，通过类反射调用 ，如果spingId为空，则按jobClass查找
     */
    @Column(name = "job_class")
    private String jobClass;

    /**
     * 任务调用的方法名
     */
    @Column(name = "method_name")
    private String methodName;

    /**
     * 启动时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 前一次运行时间
     */
    @Column(name = "previous_time")
    private Date previousTime;

    /**
     * 下次运行时间
     */
    @Column(name = "next_time")
    private Date nextTime;

    /**
     * 执行次数
     */
    @Column(name = "run_count")
    private Long runCount;

    /**
     * 异常次数
     */
    @Column(name = "error_count")
    private Long errorCount;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取任务id
     *
     * @return job_id - 任务id
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 设置任务id
     *
     * @param jobId 任务id
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取任务名称
     *
     * @return job_name - 任务名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置任务名称
     *
     * @param jobName 任务名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取任务分组，任务名称+组名称应该是唯一的
     *
     * @return job_group - 任务分组，任务名称+组名称应该是唯一的
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * 设置任务分组，任务名称+组名称应该是唯一的
     *
     * @param jobGroup 任务分组，任务名称+组名称应该是唯一的
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * 获取任务初始状态 0禁用 1暂停 2运行中
     *
     * @return job_status - 任务初始状态 0禁用 1暂停 2运行中
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * 设置任务初始状态 0禁用 1暂停 2运行中
     *
     * @param jobStatus 任务初始状态 0禁用 1暂停 2运行中
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * 获取任务是否有状态（并发）
     *
     * @return is_concurrent - 任务是否有状态（并发）
     */
    public String getIsConcurrent() {
        return isConcurrent;
    }

    /**
     * 设置任务是否有状态（并发）
     *
     * @param isConcurrent 任务是否有状态（并发）
     */
    public void setIsConcurrent(String isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    /**
     * 获取任务运行时间表达式
     *
     * @return cron_expression - 任务运行时间表达式
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * 设置任务运行时间表达式
     *
     * @param cronExpression 任务运行时间表达式
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * 获取任务描述
     *
     * @return description - 任务描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置任务描述
     *
     * @param description 任务描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取任务调用类在spring中注册的bean id，如果spingId不为空，则按springId查找
     *
     * @return spring_id - 任务调用类在spring中注册的bean id，如果spingId不为空，则按springId查找
     */
    public String getSpringId() {
        return springId;
    }

    /**
     * 设置任务调用类在spring中注册的bean id，如果spingId不为空，则按springId查找
     *
     * @param springId 任务调用类在spring中注册的bean id，如果spingId不为空，则按springId查找
     */
    public void setSpringId(String springId) {
        this.springId = springId;
    }

    /**
     * 获取任务调用类名，包名+类名，通过类反射调用 ，如果spingId为空，则按jobClass查找
     *
     * @return job_class - 任务调用类名，包名+类名，通过类反射调用 ，如果spingId为空，则按jobClass查找
     */
    public String getJobClass() {
        return jobClass;
    }

    /**
     * 设置任务调用类名，包名+类名，通过类反射调用 ，如果spingId为空，则按jobClass查找
     *
     * @param jobClass 任务调用类名，包名+类名，通过类反射调用 ，如果spingId为空，则按jobClass查找
     */
    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    /**
     * 获取任务调用的方法名
     *
     * @return method_name - 任务调用的方法名
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置任务调用的方法名
     *
     * @param methodName 任务调用的方法名
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * 获取启动时间
     *
     * @return start_time - 启动时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置启动时间
     *
     * @param startTime 启动时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取前一次运行时间
     *
     * @return previous_time - 前一次运行时间
     */
    public Date getPreviousTime() {
        return previousTime;
    }

    /**
     * 设置前一次运行时间
     *
     * @param previousTime 前一次运行时间
     */
    public void setPreviousTime(Date previousTime) {
        this.previousTime = previousTime;
    }

    /**
     * 获取下次运行时间
     *
     * @return next_time - 下次运行时间
     */
    public Date getNextTime() {
        return nextTime;
    }

    /**
     * 设置下次运行时间
     *
     * @param nextTime 下次运行时间
     */
    public void setNextTime(Date nextTime) {
        this.nextTime = nextTime;
    }

    /**
     * 获取执行次数
     *
     * @return run_count - 执行次数
     */
    public Long getRunCount() {
        return runCount;
    }

    /**
     * 设置执行次数
     *
     * @param runCount 执行次数
     */
    public void setRunCount(Long runCount) {
        this.runCount = runCount;
    }

    /**
     * 获取异常次数
     *
     * @return error_count - 异常次数
     */
    public Long getErrorCount() {
        return errorCount;
    }

    /**
     * 设置异常次数
     *
     * @param errorCount 异常次数
     */
    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }
}