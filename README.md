# MP3Slicer

## 简介
MP3Slicer 是一个高效、易用的 Java 工具库，专为MP3音频文件切割设计。无论你是需要将大型音频文件拆分为更小的片段，还是想提取特定时间段的音频，MP3Slicer 都能满足你的需求。

## 特性
- **精准切割**：根据指定的片段大小、时间点或时间段切割MP3文件，确保音质不受损。
- **简洁API**：提供简洁易用的API，便于快速集成到现有项目中。
- **跨平台**：兼容各大操作系统，运行环境只需Java支持。

## 安装与使用

### 前提条件
- Java 8 或更高版本
- Maven 构建工具

### 导入步骤

1.下载依赖

```yaml
<dependency>
    <groupId>com.mpatric</groupId>
    <artifactId>mp3agic</artifactId>
    <version>0.9.1</version>
</dependency>
```

2.导入类文件MP3Slicer.Class

3.调用类方法完成音频文件切割

```java
//按照音频片段大小切割
public static List<byte[]> split(File sourceFile,long segmentSize);

//按照音频片段起始结束时间切割
public static byte[] split(File sourceFile,int startSecond,int endSecond);
```

