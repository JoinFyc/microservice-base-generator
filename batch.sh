#!/bin/bash
#shell
#PROJECT_NAMES="pay_ser_stub" sh batch.sh

# 配置变量
ARCHETYPE_GROUP_ID="com.fei.base"
ARCHETYPE_ARTIFACT_ID="microservice-base-generator-archetype"
ARCHETYPE_VERSION="1.2.0"
GROUP_ID="com.fei.base"
PACKAGE="com.fei.base"
VERSION="1.0.0-SNAPSHOT"
BASE_DIR="/Users/architecture/project" # 指定基础目录

# 项目名称列表
# 默认的 PROJECT_NAMES 数组
#DEFAULT_PROJECT_NAMES=("pay-cashier" "pay-config" "pay-route" "pay-core" "pay-channel-wechat-2" "pay-channel-alipay" "pay-promo" "pay-trade-notify" "pay-trade-insure")
DEFAULT_PROJECT_NAMES=("pay_ser_stub")

# 检查是否在终端指定了 PROJECT_NAMES 参数
if [ -n "$PROJECT_NAMES" ]; then
    # 如果指定了，则使用指定的值
    IFS=' ' read -r -a PROJECT_NAMES <<< "$PROJECT_NAMES"
else
    # 如果未指定，则使用默认值
    PROJECT_NAMES=("${DEFAULT_PROJECT_NAMES[@]}")
    echo "未指定项目名称"
fi

# 生成项目
for PROJECT_NAME in "${PROJECT_NAMES[@]}"
do
    # 生成项目的目录路径
    OUTPUT_DIR="${BASE_DIR}"

    # 确保目录存在
    mkdir -p "${OUTPUT_DIR}"

    mvn archetype:generate \
        -DgroupId=${GROUP_ID} \
        -DartifactId=${PROJECT_NAME} \
        -Dversion=${VERSION} \
        -Dpackage=${PACKAGE} \
        -DarchetypeGroupId=${ARCHETYPE_GROUP_ID} \
        -DarchetypeArtifactId=${ARCHETYPE_ARTIFACT_ID} \
        -DarchetypeVersion=${ARCHETYPE_VERSION} \
        -DinteractiveMode=false \
        -DoutputDirectory="${OUTPUT_DIR}" # 指定输出目录

    echo "Generated project ${PROJECT_NAME} in ${OUTPUT_DIR}"
done
