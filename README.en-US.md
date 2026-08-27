[中文](./README.md) | English



# JimuReport (Free Report Tool)

v2.5.1 | 2026-08-25


[![](https://img.shields.io/badge/Author-北京国炬信息技术有限公司-orange.svg)](https://guojusoft.com)
[![](https://img.shields.io/badge/version-2.5.1-brightgreen.svg)](https://github.com/jeecgboot/JimuReport)
[![](https://img.shields.io/badge/Blog-积木报表官网-blue.svg)](http://jimureport.com)
[![](https://img.shields.io/badge/Docs-Documentation-9cf.svg)](https://help.jimureport.com)
[![](https://img.shields.io/badge/AI-Report%20%26%20Big%20Screen%20%26%20ChatBI-ff5722.svg)](https://jimureport.com/skills)
[![GitHub stars](https://img.shields.io/github/stars/jeecgboot/JimuReport.svg?style=social&label=Stars)](https://github.com/jeecgboot/JimuReport)
[![GitHub forks](https://img.shields.io/github/forks/jeecgboot/JimuReport.svg?style=social&label=Fork)](https://github.com/jeecgboot/JimuReport)


> **🎉 JimuChatBI is now live: the first free and open-source conversational intelligent data analytics product (Chat2BI). A truly AI-powered reporting tool is here! Generate reports and data screens from one sentence, with conversational AI refinement and optimization; Excel-like online report design, compatible with Xinchuang / domestic data sources — a cost-effective open-source alternative to FineReport and Tableau.** ✨


<p align="center">
  <img width="90%" src="https://upload.jeecg.com/jeecg/jimusite/jimureport_function_202605.webp" alt="JimuReport Feature Overview"/>
</p>


## Contents

- [Product Overview](#product-overview)
- [Background](#background)
- [Why Choose JimuReport](#why-choose-jimureport)
- [Quick Links](#quick-links)
- [Quick Integration](#quick-integration)
- [Deployment & Running](#deployment--running)
- [AI-Powered Generation](#ai-powered-generation)
- [Database Compatibility](#database-compatibility)
- [Feature List](#feature-list)
- [Screenshots](#screenshots)
- [License](#license)
- [Donation](#donation)
- [Disclaimer](#disclaimer)


## Product Overview

JimuReport is a **free data visualization reporting tool** that brings reports, printing, big screens, dashboards, and conversational BI together — design entirely online, like building with blocks. It consists of three modules: **JimuReport** focuses on traditional complex reports and printing, **JimuBI** focuses on big-screen and dashboard visualization, and **JimuChatBI** provides conversational intelligent data analysis, enabling data queries and insights through natural language.

- **🎉 JimuChatBI is now live**: the **first free and open-source conversational intelligent data analytics product (Chat2BI)**. Just tell AI what you need — tables, charts, and grouped summaries are generated automatically, handling complex reporting scenarios with ease. Want a big screen? One sentence does that too. Welcome to the AI era of data analytics.
- **AI-Powered Generation**: Built-in Claude Code skills (AI report / big screen / dashboard / ChatBI) generate professional visualization pages from a single sentence, with conversational AI refinement and optimization — no more tedious drag-and-drop.
- **Excel-like Designer**: Web-based drag-and-drop design, WYSIWYG, focused on solving enterprise-grade complex reporting challenges.
- **Enterprise Advanced Features**: grouping / cross-tab / master-detail reports, **multi-sheet reports**, data drill-down, **one-click printing**, form-overlay & invoice printing, **data filling**, **mobile reports**, QR/barcodes, and more.
- **Full-Scenario Coverage**: JimuBI supports big screens, dashboards, portals, and mobile — develop once, adapt everywhere; JimuChatBI enables data queries and analysis through natural-language conversation, lowering the barrier to BI; big screens use a Word-like style with freely draggable components.
- **Simple · Easy · Professional**: greatly lowers report development difficulty, shortens development cycles, and saves costs.

> **Open Source First** — building "professional, easy-to-use, AI-intelligent" data visualization reports, big screens, and portals
>
> **One-Sentence AI Generation** — AI Report · AI Big Screen · AI Dashboard
>
> **License** — free to use, commercial use allowed, source code not open


## Background

Reports are an indispensable part of enterprise IT, yet the industry has long lacked a tool that is both free and genuinely good — free options are mostly weak and not intelligent enough, while commercial reports are expensive. That is exactly why we set out to build a free reporting tool.

So what kind of report should it be? With the rise of low-code, the traditional model of designing templates in a tool and then integrating them with systems has become outdated. What we pursue is fully online design with visual, zero-barrier operation — truly simple, easy to use, and intelligent.

And with the arrival of the AI wave, JimuReport goes a step further by introducing **AI capabilities** — built-in Claude Code skills let you generate reports, big screens, dashboards, and **JimuChatBI conversational analytics** from a single sentence, shifting report design from "dragging" to "conversation" for true intelligence and efficiency.

**JimuChatBI — the first free and open-source conversational intelligent data analytics product (Chat2BI)**: a truly AI-powered reporting tool is here! Users simply describe their analysis needs in chat, and the system automatically generates tables, charts, and grouped summaries, with conversational AI refinement and optimization to handle even complex reporting scenarios with ease.


## Why Choose JimuReport

>    **Permanently free · AI-intelligent · full-scenario** — **JimuChatBI: the first free and open-source conversational intelligent data analytics product (Chat2BI)**. Generate reports and data screens from one sentence, design with Excel-like drag-and-drop, with 30+ data sources, complex reports, precise printing, data filling, big screens and dashboards all in one. The reporting tool of choice for the low-code era!

- **JimuChatBI is now live**: the **first free and open-source conversational intelligent data analytics product (Chat2BI)**. Just tell AI what you need — tables, charts, and grouped summaries are generated automatically; want a big screen, one sentence does that too. Welcome to the AI era of data analytics.
- **Quick Integration**: works with any SpringBoot scaffold project.
- **AI-Powered**: built-in Claude Code skills (AI report / big screen / dashboard / ChatBI) generate editable visualization pages from a single sentence or a screenshot, with conversational AI refinement and optimization.
- **Excel-like Designer**: web drag-and-drop, WYSIWYG; supports multi-sheet, unlimited rows/columns, frozen panes, plus report functions like SUMIFS / VLOOKUP / IF with automatic totals.
- **Complex Reports**: full coverage of grouping, cross-tab, master-detail, detail, multi-header, data drill-down, alerts, conditional query, and QR/barcode reports.
- **Data Binding & Big Data**: compatible with 30+ data sources (MySQL, Oracle, DM, KingbaseES, plus Hive, ClickHouse, Doris, ES, MongoDB, files / multi-files, etc.), with SQL / API / JSON / WebSocket multi-source binding and chart linkage & drill-down.
- **Localization (Xinchuang)**: full support for the Xinchuang ecosystem, adapting to domestic databases such as DM, KingbaseES, ShenTong, and Huawei GaussDB, and running on domestic operating systems like Kylin and UOS.
- **Precise Printing & Form Filling**: form-overlay and background printing, seamless invoice/certificate printing; online form filling with write-back to the database; export to Excel / PDF / Word / image.
- **Big Screens & Dashboards**: ECharts with 28+ chart types, Word-style drag-and-drop big screens, 24-column grid dashboards, paired with portal business boards.
- **Mobile & Full-Scenario**: reports, big screens, and dashboards — develop once, adapt to PC / mobile / big screen / portal.


## Quick Links

| Resource | URL |
| --- | --- |
| 🏠 Official Website | http://jimureport.com |
| 🎯 Online Demo | http://jimureport.com/login (one-click mobile registration, free to use) |
| 📖 Documentation | https://help.jimureport.com |
| 🤖 AI Capabilities | https://help.jimureport.com/rumen/aiAssistant/ |
| 🧩 Skills Repository | https://github.com/jeecgboot/skills |
| 🎬 Video Tutorials | http://jimureport.com/doc/video |
| 🐛 Issues | https://github.com/jeecgboot/JimuReport/issues/new |
| 💬 QQ Groups | 873666520, 854804538(full), ③596660273(full), ①212391162(full), ②929646317(full) |


## Quick Integration

> Supports quick integration into SpringBoot scaffold projects. SpringBoot4 requires JDK17+, SpringBoot2 requires JDK8+. See the [integration docs](https://help.jimureport.com/quick.html) for details.

#### Step 1: Add JimuReport Dependencies

-   springboot3

```
 <dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimureport-spring-boot3-starter</artifactId>
    <version>2.5.1</version>
 </dependency>
 <!-- MongoDB, Redis, and file dataset support package, add as needed -->
 <dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimureport-nosql-starter3</artifactId>
    <version>2.3.0</version>
 </dependency>
 <!-- Backend export interface ECharts support package, add as needed -->
 <dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimureport-echarts-starter</artifactId>
    <version>2.3.0</version>
 </dependency>
```

-   springboot4

```
 <dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimureport-spring-boot4-starter</artifactId>
    <version>2.5.1</version>
 </dependency>
```

-   springboot2

```
 <dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimureport-spring-boot-starter</artifactId>
    <version>2.3.4</version>
 </dependency>
 <dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimureport-nosql-starter</artifactId>
    <version>2.1.0</version>
 </dependency>
 <dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimureport-echarts-starter</artifactId>
    <version>2.3.0</version>
 </dependency>
```

#### Step 2: Add JimuBI Dependencies (Dashboards and Big Screens)

-   springboot3

```
<dependency>
  <groupId>org.jeecgframework.jimureport</groupId>
  <artifactId>jimubi-spring-boot3-starter</artifactId>
  <version>2.5.0</version>
</dependency>
```

-   springboot4

```
<dependency>
  <groupId>org.jeecgframework.jimureport</groupId>
  <artifactId>jimubi-spring-boot4-starter</artifactId>
  <version>2.5.0</version>
</dependency>
```

-   springboot2

```
 <dependency>
   <groupId>org.jeecgframework.jimureport</groupId>
   <artifactId>jimubi-spring-boot-starter</artifactId>
   <version>2.3.2</version>
 </dependency>
```

#### Step 3: Add JimuChatBI Dependencies (Conversational Intelligent Data Analysis)

-  The current dependency supports both Spring Boot 4 and Spring Boot 3 projects.

```
<!-- JimuChatBI -->
<dependency>
    <groupId>org.jeecgframework.jimureport</groupId>
    <artifactId>jimuchatbi-spring-boot4-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### Step 4: Initialize SQL and Required Configuration

- https://help.jimureport.com/quick.html


## Deployment & Running

#### jimureport-example Environment Requirements

- Requires JDK17+ (this project uses SpringBoot4 architecture)
- Requires MySQL 5.7+; manually execute `db/jimureport.mysql5.7.create.sql`, which automatically creates the jimureport database
- Project configuration: `src/main/resources/application-dev.yml`
- Requires Redis (optional)

#### Green Installation-Free Version

- [Integrated Source Code Run](https://github.com/jeecgboot/JimuReport/tree/master/jimureport-example)
- [Docker Quick Run](https://help.jimureport.com/docker.html)
- [Green Installation-Free Version](https://pan.baidu.com/s/1z9VmMz4HCc7GMVbzugetLQ?pwd=xafr)

> Default account / password: admin / 123456, [password change supported](https://help.jimureport.com/qa?_highlight=%E5%AF%86%E7%A0%81#4-jimureport-example%E9%A1%B9%E7%9B%AE%E6%80%8E%E4%B9%88%E4%BF%AE%E6%94%B9%E9%BB%98%E8%AE%A4%E5%AF%86%E7%A0%81)


## AI-Powered Generation

> A collection of JimuReport Claude Code skills: describe your needs in one sentence and AI generates **AI reports**, **AI big screens**, **AI dashboards**, and **AI conversational BI (JimuChatBI)**, covering the full data-visualization spectrum — no more tedious drag-and-drop.
>
> **🎉 JimuChatBI — the first free and open-source conversational intelligent data analytics product (Chat2BI)**: just tell AI what you need — tables, charts, and grouped summaries are generated automatically, handling complex reporting scenarios with ease; want a big screen, one sentence does that too, with conversational AI refinement and optimization. Welcome to the AI era of data analytics.

#### 🚀 One-Click Install: Claude Code + JimuReport Skills

**Option 1: Install the full environment with a single command**

Mirror-accelerated for users in China. Installs Node.js, Python 3.12+, Git, Claude Code, and JimuReport Skills in one go, and connects DeepSeek v4 as the model backend (billed per token, [bring your own API Key](https://platform.deepseek.com/api_keys)). Ready to use once it finishes.

Windows (PowerShell):

```
irm https://www.qiaoqiaoyun.com/claude/boot.ps1 | iex
```

macOS / Linux:

```
curl -fsSL https://www.qiaoqiaoyun.com/claude/install-claude-code.sh | bash
```

**Option 2: Already have Claude Code, install Skills only**

```
git clone https://github.com/jeecgboot/skills.git ~/.claude/skills
# Update: cd ~/.claude/skills && git pull
```

Once installed, open a new terminal and run `claude` to generate reports and big screens with natural language.

> Skills repository: https://github.com/jeecgboot/skills · Skills website: https://jimureport.com/skills

#### 📦 Skills Catalog

| Skill | Purpose | One-Sentence Example |
| --- | --- | --- |
| `jimureport` | Generate a report from one sentence | Create a salary statistics report grouped by department |
| `jimubi-bigscreen` | Generate a big screen from one sentence | Create a smart logistics monitoring big screen |
| `jimubi-dashboard` | Generate a dashboard / portal from one sentence | Generate a sales operations KPI board |

> Prompt examples: [AI Reports](https://help.jimureport.com/rumen/jimureport-prompts) · [AI Big Screens](https://help.jimureport.com/rumen/bigscreen-prompts)


## Database Compatibility

Supports 30+ data sources including Xinchuang/localized databases, conventional databases, and NoSQL. Fully adapts to domestic databases such as DM, KingbaseES, ShenTong, and Huawei GaussDB, and supports querying non-physical databases like CSV and MongoDB via SQL.

|  Database   |  Support   |
| --- | --- |
|   MySQL   |  √   |
|  Oracle, Oracle9i   |  √   |
|  SqlServer, SqlServer2012   |  √   |
|   PostgreSQL   |  √   |
|   DB2, Informix   |  √   |
|   MariaDB   |  √   |
|  SQLite, Hsqldb, Derby, H2   |  √   |
|   DM, KingbaseES, ShenTong   |  √   |
|   Huawei GaussDB, XuGu, HighGo, TDengine   |  √   |
|   Alibaba Cloud PolarDB, PPAS, HerdDB   |  √   |
|  Hive, HBase, CouchBase   |  √   |
|  Import Excel, CSV, JSON file datasets   |  √   |
|  SQLite, TiDB, Doris, ClickHouse, MongoDB-BI   |  √   |
|  Elasticsearch, MongoDB  |  √   |

For databases without provided scripts, refer to the [documentation](https://my.oschina.net/jeecg/blog/4905722) to convert them yourself.


## Feature List

More feature list: [http://jimureport.com/plan](http://jimureport.com/plan)

<details>
<summary><b>📊 Report Designer Feature List (click to expand)</b></summary>

```
├─Report Designer
│  ├─AI Intelligent Generation
│  │  ├─Generate reports from a single sentence (Claude Code skills)
│  │  ├─Recognize a screenshot and restore it into an editable template
│  ├─Data Source / Dataset
│  │  ├─Supports multiple data sources such as Oracle, MySQL, SQLServer, PostgreSQL and other mainstream databases
│  │  ├─Supports intelligent SQL writing pages, showing table lists and field lists under data sources
│  │  ├─SQL dataset
│  │  ├─API dataset (fetch data via interface)
│  │  ├─JSON dataset
│  │  ├─Stored procedure dataset
│  │  ├─Supports parameters
│  │  ├─Supports single and multiple data source settings
│  │  ├─Multi-source report (one report joining multiple datasets across databases)
│  ├─Cell Format
│  │  ├─Borders
│  │  ├─Font size
│  │  ├─Font color
│  │  ├─Background color
│  │  ├─Font bold
│  │  ├─Supports horizontal and vertical distributed alignment
│  │  ├─Supports automatic text wrapping settings
│  │  ├─Set images as image backgrounds
│  │  ├─Supports unlimited rows and columns
│  │  ├─Supports frozen windows within the designer
│  │  ├─Supports copying, pasting, and deleting cell content or format
│  │  ├─And more
│  ├─Report Elements
│  │  ├─Text type: Write text directly; supports setting decimal places for numeric text
│  │  ├─Image type: Supports uploading an image
│  │  ├─Chart type
│  │  ├─Function type
│  │  └─Supports sum
│  │  └─Average
│  │  └─Maximum
│  │  └─Minimum
│  ├─Background
│  │  ├─Background color settings
│  │  ├─Background image settings
│  │  ├─Background transparency settings
│  │  ├─Background size settings
│  ├─Data Dictionary
│  ├─Report Printing
│  │  ├─Custom printing
│  │  └─Custom style design printing for medical prescriptions, arrest warrants, introduction letters, etc.
│  │  ├─Simple data printing
│  │  └─Inventory receipts, sales table printing
│  │  └─Parameterized printing
│  │  └─Paginated printing
│  │  ├─Form overlay printing
│  │  └─Real estate certificate printing
│  │  └─Invoice printing
│  ├─Data Reports
│  │  ├─Grouped data reports
│  │  └─Horizontal data grouping
│  │  └─Vertical data grouping
│  │  └─Multi-level loop header grouping
│  │  └─Horizontal grouping subtotals
│  │  └─Vertical grouping subtotals
│  │  └─Grand totals
│  │  ├─Cross-tabulation reports
│  │  ├─Detail tables
│  │  ├─Conditional query reports
│  │  ├─Expression reports
│  │  ├─QR code/barcode reports
│  │  ├─Multi-header complex reports
│  │  ├─Master-detail reports
│  │  ├─Alert reports
│  │  ├─Data drill-down reports
│  │  ├─Multi-sheet reports
│  ├─Data Filling
│  │  ├─Online form filling
│  │  ├─Write-back to database
│  │  ├─Filling validation rules
│  │  ├─Dropdown / dictionary / date filling controls
│  │  ├─Batch import of filling data
│  ├─Chart Reports
│  │  ├─Column charts
│  │  ├─Line charts
│  │  ├─Pie charts
│  │  ├─Combination charts
│  │  ├─Scatter plots
│  │  ├─Funnel charts
│  │  ├─Radar charts
│  │  ├─Pictorial charts
│  │  ├─Maps
│  │  ├─Gauges
│  │  ├─Relationship charts
│  │  ├─Chart backgrounds
│  │  ├─Dynamic chart refresh
│  │  ├─Chart data dictionary
│  ├─Parameters
│  │  ├─Parameter configuration
│  │  ├─Parameter management
│  ├─Import/Export
│  │  ├─Import Excel
│  │  ├─Export Excel, PDF, Word, image
│  ├─Print Settings
│  │  ├─Print area settings
│  │  ├─Printer settings
│  │  ├─Preview
│  │  ├─Print page number settings
│  ├─Mobile Adaptation
│  │  ├─Report / chart browsing on mobile
│  │  ├─Mobile form filling
│  ├─Advanced Features
│  │  ├─Scheduled data refresh
│  │  ├─Cell hyperlinks / jumps
│  │  ├─Drill-down linkage
│  │  ├─Data caching
│  │  ├─JS / backend enhancement
```

</details>

<details>
<summary><b>📺 Big Screen Designer Feature List (click to expand)</b></summary>

```
├─Large Screen Designer
│  ├─System Functions
│  │  ├─Static and dynamic data source settings
│  │  ├─Basic functions
│  │  └─Supports drag-and-drop design
│  │  └─Supports add, delete, modify, query large screens
│  │  └─Supports copying large screen data and styles
│  │  └─Supports large screen preview and sharing
│  │  └─Supports automatic data saving and manual data recovery
│  │  └─Supports setting large screen passwords
│  │  └─Supports deleting, grouping, moving up/down, bring to front/back for component layers
│  │  ├─Background Settings
│  │  └─Large screen width and height settings
│  │  └─Large screen description settings
│  │  └─Background color and background image settings
│  │  └─Cover image settings
│  │  └─Zoom ratio settings
│  │  └─Environment address settings
│  │  └─Watermark settings
│  │  ├─Map Settings
│  │  └─Add maps
│  │  └─Map data isolation
│  ├─Charts
│  │  ├─Column charts
│  │  ├─Line charts
│  │  ├─Combination charts
│  │  ├─Pie charts
│  │  ├─Pictorial charts
│  │  ├─Radar charts
│  │  ├─Scatter plots
│  │  ├─Funnel charts
│  │  ├─Text boxes
│  │  ├─Marquee
│  │  ├─Hyperlinks
│  │  ├─Real-time clock
│  │  ├─Maps
│  │  ├─National logistics map
│  │  ├─Geographic coordinate map
│  │  ├─City delivery map
│  │  ├─Images
│  │  ├─Image frames
│  │  ├─Carousel
│  │  ├─Slider components
│  │  ├─iframe
│  │  ├─video
│  │  ├─Flip counter
│  │  ├─Ring charts
│  │  ├─Progress bars
│  │  ├─Gauges
│  │  ├─Word cloud
│  │  ├─Tables
│  │  ├─Tabs
│  │  ├─Universal components
└─Other Modules
   └─More features in development...
```

</details>

<details>
<summary><b>📈 Dashboard Designer Feature List (click to expand)</b></summary>

```
├─Dashboard Designer
│  ├─Basic Functions
│  │  └─Supports drag-and-drop design
│  │  └─Supports add, delete, modify, query dashboards
│  │  └─Supports copying dashboard data and styles
│  │  └─Supports dashboard preview and sharing
│  │  └─Supports setting dashboard protection code
│  │  └─Supports setting dashboard PC mode or mobile mode
│  │  └─Supports adding, deleting, moving dashboard controls
│  ├─Data Sources
│  │  └─Supports multiple data sources such as Oracle, MySQL, SQLServer, PostgreSQL and other mainstream databases
│  │  └─Supports intelligent SQL writing pages, showing table lists and field lists under data sources
│  │  └─Supports parameters
│  ├─Data Sets
│  │  └─SQL
│  │  └─API
│  │  └─JSON
│  │  └─WebSocket
│  │  └─Static data sets
│  ├─Data
│  │  └─Set data count
│  │  └─Data filtering
│  │  └─Data auto-refresh
│  ├─Charts
│  │  └─Column charts
│  │  └─Pie charts
│  │  └─Nightingale rose charts
│  │  └─Line charts
│  │  └─Ring charts
│  │  └─Area charts
│  │  └─Progress charts
│  │  └─Pictorial charts
│  │  └─Gauges
│  │  └─Scatter plots
│  │  └─Funnel charts
│  │  └─Radar charts
│  ├─Common
│  │  └─Query conditions
│  │  └─Carousel
│  │  └─Iframe
│  │  └─Calendar
│  │  └─Images
│  │  └─Text
│  │  └─Numbers
│  │  └─Buttons
│  │  └─Current time
│  │  └─Rich text
│  ├─Layout
│  │  └─Tabs
│  │  └─Grid
│  ├─Data
│  │  └─Data tables
│  │  └─Data lists
│  │  └─Universal components
│  ├─Maps
│  │  └─Scatter maps
│  │  └─Flight line maps
│  │  └─Column maps
│  │  └─Timeline flight line maps
│  │  └─Column ranking maps
│  │  └─Heat maps
│  │  └─Regional maps
│  ├─Homepage
│  │  └─Quick navigation
│  │  └─Statistics cards
│  │  └─Project lists
│  │  └─Simple cards
│  │  └─To-do items
│  │  └─Latest activities
│  ├─Personality
│  │  └─Bull market surge
│  │  └─Five elements cycle
│  │  └─Gantt charts
│  ├─Style Configuration
│  │  └─Basic configuration
│  │  └─Title settings
│  │  └─Subtitle settings
│  │  └─X-axis settings
│  │  └─Y-axis settings
│  │  └─Tooltip settings
│  │  └─Coordinate axis margins
│  │  └─Legend settings
│  │  └─Custom color schemes
│  │  └─Card settings
│  │  └─Custom properties
│  │  └─Numerical settings
│  ├─Interaction Settings
│  │  └─Linkage configuration
│  │  └─Query configuration
│  │  └─Jump configuration
│  │  └─Drill-down configuration
│  │  └─Custom JS
└─ Export
    └─Images
    └─PDF
    └─Excel
```

</details>


## Screenshots

### Report Workbench

<table>
<tr>
<td width="50%"><b>Report Designer</b> · fully online design<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-752b454f64ed87c798b3e8a083fbd6622d4.gif"/></td>
<td width="50%"><b>Chart Reports</b> · 28+ chart types<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-3eda428ef182cb64a1a8e132e4bfeb87718.png"/></td>
</tr>
<tr>
<td><b>Data Reports</b> · grouping<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-fe2ac0dfc3933734961924de0538b3049d2.png"/></td>
<td><b>Print Design</b> · form overlay<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-8863ea4e67c02dbd844bb8022652f1be651.png"/></td>
</tr>
<tr>
<td><b>Data Reports</b> · cross-tab / totals<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-be956cbc19287e4df9cc46c9d15e96da99d.png"/></td>
<td><b>Chart Reports</b> · 28 chart types<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-22096123c5b6a10a801967c33cc33a7af11.png"/></td>
</tr>
<tr>
<td><b>Print Design</b> · hospital document printing<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-9b6cd73719de68e0e45e1cf95cd6104a103.png"/></td>
<td><b>Form Filling</b> · employee info form<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-0139eb90f2d255152aa69d3b37fcc85e4a2.png"/></td>
</tr>
<tr>
<td><b>Form Filling</b> · sales order form<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-ded4831b7e25638f9ba6033a1f4ba87474f.png"/></td>
<td><b>Form Filling</b> · master-detail form<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-f7c1a3a4cd6673038727ba49c3ee97e216b.png"/></td>
</tr>
<tr>
<td align="center"><b>Mobile Reports</b> · mobile report<br/><img height="420" src="https://oscimg.oschina.net/oscnet/up-b50ba7d60fdd9c88106a192af5d4b94144b.png"/></td>
<td align="center"><b>Mobile Reports</b> · mobile charts<br/><img height="420" src="https://oscimg.oschina.net/oscnet/up-00827ce793c32519e6e9ad0fe364bc4f9a5.png"/></td>
</tr>
</table>

### Big Screen Design Effects

<table>
<tr>
<td width="50%"><img width="100%" src="https://oscimg.oschina.net/oscnet/up-402a6034124474bfef8dfc5b4b2bac1ce5c.png"/></td>
<td width="50%"><img width="100%" src="https://oscimg.oschina.net/oscnet/up-6f7ba2e2ebbeea0d203db8d69fd87644c9f.png"/></td>
</tr>
<tr>
<td><img width="100%" src="https://oscimg.oschina.net/oscnet/up-ee8d34f318da466b8a6070a6e3111d12ce7.png"/></td>
<td><img width="100%" src="https://oscimg.oschina.net/oscnet/up-826f13c88f23c24ff218687f57f03d802a8.png"/></td>
</tr>
<tr>
<td><img width="100%" src="https://oscimg.oschina.net/oscnet/up-61dfc52c383f86a4055e20d030503bef93c.png"/></td>
<td><img width="100%" src="https://oscimg.oschina.net/oscnet/up-3aabd991c6c5af43f35b204d3ec94caf468.png"/></td>
</tr>
<tr>
<td><img width="100%" src="https://oscimg.oschina.net/oscnet/up-3b75fde569ab528d8607596e147b8bb7d5e.png"/></td>
<td><img width="100%" src="https://oscimg.oschina.net/oscnet/up-3b8d034341d0190156d63484ce09a863c9c.png"/></td>
</tr>
<tr>
<td><b>Full-screen Popup</b> · click to pop up a list page<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-5a4d68eb1999f84a4a0205c2904a94b24ad.gif"/></td>
<td><b>Adaptive Dialog</b> · the popped-up detail screen<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-1868dddbbef4ddeccb4099b92c68636d20e.gif"/></td>
</tr>
<tr>
<td><b>Auto Screen Switch</b> · auto-switch every 5 minutes<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-4f8f995c055810a91eda0327b737d61f6c9.gif"/></td>
<td><b>Gaode Maps</b> · real-time vehicle locations<br/><img width="100%" src="https://oscimg.oschina.net/oscnet/up-eb73f595417712f2a51ddea4755fca3da67.png"/></td>
</tr>
</table>

### Dashboard and Portal Design

<table>
<tr>
<td width="50%"><img width="100%" src="https://jeecgos.oss-cn-beijing.aliyuncs.com/files/darg20240726105556.png"/></td>
<td width="50%"><img width="100%" src="https://jeecgos.oss-cn-beijing.aliyuncs.com/files/drag20240724135626.png"/></td>
</tr>
<tr>
<td><img width="100%" src="https://jeecgos.oss-cn-beijing.aliyuncs.com/files/drag20240724135619.png"/></td>
<td><img width="100%" src="https://jeecgos.oss-cn-beijing.aliyuncs.com/files/drag20240724135630.png"/></td>
</tr>
<tr>
<td align="center"><b>Mobile Dashboard</b><br/><img height="420" src="https://oscimg.oschina.net/oscnet/up-6961e4ad456c4ab98414c11bc9f710b509f.png"/></td>
<td align="center"><b>Mobile Portal</b><br/><img height="420" src="https://oscimg.oschina.net/oscnet/up-af054839a6f1e2ce8d1cea1dd8a5c5e072a.png"/></td>
</tr>
</table>


## License

The open-source version is released under the LGPL license. If you cannot accept LGPL and need to use this project for commercial purposes without retaining copyright information (preview "Powered by JimuReport", "JimuReport Logo" and other copyright and links), you need to purchase a [commercial license](http://jimureport.com/vip) to protect your legal rights.


## Donation

If you think it's not bad, please buy the author a cup of coffee ☺

![](https://static.oschina.net/uploads/img/201903/08155608_0EFX.png)


## Disclaimer

JimuReport is released under a dual-license model: the [GPL-3.0](https://www.gnu.org/licenses/gpl-3.0.html) open-source license together with [additional supplementary terms](./LICENSE). For commercial licensing, please refer to [http://jimureport.com/vip](http://jimureport.com/vip). Please read the following disclaimer carefully before using this software:

1. **Provided "AS IS"**  
   This software and its related documentation are provided "AS IS", without warranty of any kind, express or implied, including but not limited to warranties of merchantability, fitness for a particular purpose, and non-infringement.

2. **Use at Your Own Risk**  
   Users shall evaluate whether this software meets their own business scenarios, and shall bear all risks arising from downloading, installing, using, modifying, or further developing this software, including but not limited to data loss, business interruption, loss of revenue, or any other form of damage.

3. **Limitation of Liability**  
   To the maximum extent permitted by applicable law, the authors, contributors, and copyright holders of JimuReport shall not be liable for any direct, indirect, incidental, special, punitive, or consequential damages suffered by users or any third party arising from the use of this software.

4. **No Competing Products**  
   Pursuant to Clause 2 of the "Supplementary Open-Source Terms" in the `LICENSE` file, users are **prohibited** from modifying and repackaging this software to release or sell products with functionality similar to JimuReport, or from otherwise competing with JimuReport in the same software product market. Any such conduct constitutes infringement, and the rights holder is entitled to demand cessation and claim compensation for resulting economic losses.

5. **Copyright Attribution Retention**  
   Pursuant to Clause 3 of the "Supplementary Open-Source Terms" in the `LICENSE` file, users must retain JimuReport's official copyright notices when deriving, integrating, or deploying this software, including but not limited to the **"Powered by 积木报表"** credit, the **JimuReport logo**, and related official links on preview pages.

By downloading, copying, installing, or otherwise using this software, you are deemed to have read, understood, and agreed to the foregoing disclaimer and all terms set forth in the `LICENSE` file.
