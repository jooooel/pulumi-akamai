// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.DatastreamArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.DatastreamState;
import com.pulumi.akamai.outputs.DatastreamAzureConnector;
import com.pulumi.akamai.outputs.DatastreamConfig;
import com.pulumi.akamai.outputs.DatastreamDatadogConnector;
import com.pulumi.akamai.outputs.DatastreamElasticsearchConnector;
import com.pulumi.akamai.outputs.DatastreamGcsConnector;
import com.pulumi.akamai.outputs.DatastreamHttpsConnector;
import com.pulumi.akamai.outputs.DatastreamLogglyConnector;
import com.pulumi.akamai.outputs.DatastreamNewRelicConnector;
import com.pulumi.akamai.outputs.DatastreamOracleConnector;
import com.pulumi.akamai.outputs.DatastreamS3Connector;
import com.pulumi.akamai.outputs.DatastreamSplunkConnector;
import com.pulumi.akamai.outputs.DatastreamSumologicConnector;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Basic usagehcl resource &#34;akamai_datastream&#34; &#34;example&#34; {
 * 
 * # (resource arguments)
 * 
 *  } You can import your Akamai DataStream configuration using a stream version ID. For example
 * 
 * ```sh
 *  $ pulumi import akamai:index/datastream:Datastream example 1234
 * ```
 * 
 *  ~&gt; **IMPORTANT:** For security reasons, this command doesn&#39;t import any secrets you specify for your connector. To make sure the state file includes complete data, use this resource to manually add the arguments marked **Secret** above.
 * 
 */
@ResourceType(type="akamai:index/datastream:Datastream")
public class Datastream extends com.pulumi.resources.CustomResource {
    /**
     * Whether you want to start activating the stream when applying the resource. Either `true` for activating the stream upon sending the request or `false` for leaving the stream inactive after the request.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output<Boolean> active;

    /**
     * @return Whether you want to start activating the stream when applying the resource. Either `true` for activating the stream upon sending the request or `false` for leaving the stream inactive after the request.
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    /**
     * Specify details about the Azure Storage connector configuration in a data stream. Note that currently DataStream supports only streaming data to [block objects](https://docs.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs). The argument includes these sub-arguments:
     * 
     */
    @Export(name="azureConnector", type=DatastreamAzureConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamAzureConnector> azureConnector;

    /**
     * @return Specify details about the Azure Storage connector configuration in a data stream. Note that currently DataStream supports only streaming data to [block objects](https://docs.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs). The argument includes these sub-arguments:
     * 
     */
    public Output<Optional<DatastreamAzureConnector>> azureConnector() {
        return Codegen.optional(this.azureConnector);
    }
    /**
     * Provides information about the log line configuration, log file format, names of log files sent, and file delivery. The argument includes these sub-arguments:
     * 
     */
    @Export(name="config", type=DatastreamConfig.class, parameters={})
    private Output<DatastreamConfig> config;

    /**
     * @return Provides information about the log line configuration, log file format, names of log files sent, and file delivery. The argument includes these sub-arguments:
     * 
     */
    public Output<DatastreamConfig> config() {
        return this.config;
    }
    /**
     * Identifies the contract that has access to the product.
     * 
     */
    @Export(name="contractId", type=String.class, parameters={})
    private Output<String> contractId;

    /**
     * @return Identifies the contract that has access to the product.
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }
    /**
     * The username who created the stream
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return The username who created the stream
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * The date and time when the stream was created
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The date and time when the stream was created
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Specify details about the Datadog connector in a stream, including:
     * 
     */
    @Export(name="datadogConnector", type=DatastreamDatadogConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamDatadogConnector> datadogConnector;

    /**
     * @return Specify details about the Datadog connector in a stream, including:
     * 
     */
    public Output<Optional<DatastreamDatadogConnector>> datadogConnector() {
        return Codegen.optional(this.datadogConnector);
    }
    /**
     * Identifiers of the data set fields within the template that you want to receive in logs. The order of the identifiers define how the value for these fields appears in the log lines. See [Data set parameters](https://techdocs.akamai.com/datastream2/reference/data-set-parameters-1).
     * 
     */
    @Export(name="datasetFieldsIds", type=List.class, parameters={Integer.class})
    private Output<List<Integer>> datasetFieldsIds;

    /**
     * @return Identifiers of the data set fields within the template that you want to receive in logs. The order of the identifiers define how the value for these fields appears in the log lines. See [Data set parameters](https://techdocs.akamai.com/datastream2/reference/data-set-parameters-1).
     * 
     */
    public Output<List<Integer>> datasetFieldsIds() {
        return this.datasetFieldsIds;
    }
    /**
     * Specify details about the Elasticsearch connector you can use in a stream, including:
     * 
     */
    @Export(name="elasticsearchConnector", type=DatastreamElasticsearchConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamElasticsearchConnector> elasticsearchConnector;

    /**
     * @return Specify details about the Elasticsearch connector you can use in a stream, including:
     * 
     */
    public Output<Optional<DatastreamElasticsearchConnector>> elasticsearchConnector() {
        return Codegen.optional(this.elasticsearchConnector);
    }
    /**
     * A list of email addresses you want to notify about activations and deactivations of the stream.
     * 
     */
    @Export(name="emailIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> emailIds;

    /**
     * @return A list of email addresses you want to notify about activations and deactivations of the stream.
     * 
     */
    public Output<Optional<List<String>>> emailIds() {
        return Codegen.optional(this.emailIds);
    }
    /**
     * Specify details about the Google Cloud Storage connector you can use in a stream. When validating this connector, DataStream uses the private access key to create an `Akamai_access_verification_&lt;timestamp&gt;.txt` object file in your GCS bucket. You can only see this file if the validation process is successful, and you have access to the Google Cloud Storage bucket where you are trying to send logs. The argument includes these sub-arguments:
     * 
     */
    @Export(name="gcsConnector", type=DatastreamGcsConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamGcsConnector> gcsConnector;

    /**
     * @return Specify details about the Google Cloud Storage connector you can use in a stream. When validating this connector, DataStream uses the private access key to create an `Akamai_access_verification_&lt;timestamp&gt;.txt` object file in your GCS bucket. You can only see this file if the validation process is successful, and you have access to the Google Cloud Storage bucket where you are trying to send logs. The argument includes these sub-arguments:
     * 
     */
    public Output<Optional<DatastreamGcsConnector>> gcsConnector() {
        return Codegen.optional(this.gcsConnector);
    }
    /**
     * Identifies the group that has access to the product and this stream configuration.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return Identifies the group that has access to the product and this stream configuration.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The name of the user group for which the stream was created
     * 
     */
    @Export(name="groupName", type=String.class, parameters={})
    private Output<String> groupName;

    /**
     * @return The name of the user group for which the stream was created
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * Specify details about the custom HTTPS endpoint you can use as a connector for a stream, including:
     * 
     */
    @Export(name="httpsConnector", type=DatastreamHttpsConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamHttpsConnector> httpsConnector;

    /**
     * @return Specify details about the custom HTTPS endpoint you can use as a connector for a stream, including:
     * 
     */
    public Output<Optional<DatastreamHttpsConnector>> httpsConnector() {
        return Codegen.optional(this.httpsConnector);
    }
    /**
     * Specify details about the Loggly connector you can use in a stream, including:
     * 
     */
    @Export(name="logglyConnector", type=DatastreamLogglyConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamLogglyConnector> logglyConnector;

    /**
     * @return Specify details about the Loggly connector you can use in a stream, including:
     * 
     */
    public Output<Optional<DatastreamLogglyConnector>> logglyConnector() {
        return Codegen.optional(this.logglyConnector);
    }
    /**
     * The username who modified the stream
     * 
     */
    @Export(name="modifiedBy", type=String.class, parameters={})
    private Output<String> modifiedBy;

    /**
     * @return The username who modified the stream
     * 
     */
    public Output<String> modifiedBy() {
        return this.modifiedBy;
    }
    /**
     * The date and time when the stream was modified
     * 
     */
    @Export(name="modifiedDate", type=String.class, parameters={})
    private Output<String> modifiedDate;

    /**
     * @return The date and time when the stream was modified
     * 
     */
    public Output<String> modifiedDate() {
        return this.modifiedDate;
    }
    /**
     * Specify details about the New Relic connector you can use in a stream, including:
     * 
     */
    @Export(name="newRelicConnector", type=DatastreamNewRelicConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamNewRelicConnector> newRelicConnector;

    /**
     * @return Specify details about the New Relic connector you can use in a stream, including:
     * 
     */
    public Output<Optional<DatastreamNewRelicConnector>> newRelicConnector() {
        return Codegen.optional(this.newRelicConnector);
    }
    /**
     * Specify details about the Oracle Cloud Storage connector in a stream. When validating this connector, DataStream uses the provided `access_key` and `secret_access_key` values and tries to save an `Akamai_access_verification_&lt;timestamp&gt;.txt` file in your Oracle Cloud Storage folder. You can only see this file if the validation process is successful, and you have access to the Oracle Cloud Storage bucket and folder that you’re trying to send logs to.
     * 
     */
    @Export(name="oracleConnector", type=DatastreamOracleConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamOracleConnector> oracleConnector;

    /**
     * @return Specify details about the Oracle Cloud Storage connector in a stream. When validating this connector, DataStream uses the provided `access_key` and `secret_access_key` values and tries to save an `Akamai_access_verification_&lt;timestamp&gt;.txt` file in your Oracle Cloud Storage folder. You can only see this file if the validation process is successful, and you have access to the Oracle Cloud Storage bucket and folder that you’re trying to send logs to.
     * 
     */
    public Output<Optional<DatastreamOracleConnector>> oracleConnector() {
        return Codegen.optional(this.oracleConnector);
    }
    /**
     * The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
     * 
     */
    @Export(name="papiJson", type=String.class, parameters={})
    private Output<String> papiJson;

    /**
     * @return The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
     * 
     */
    public Output<String> papiJson() {
        return this.papiJson;
    }
    /**
     * The ID of the product for which the stream was created
     * 
     */
    @Export(name="productId", type=String.class, parameters={})
    private Output<String> productId;

    /**
     * @return The ID of the product for which the stream was created
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }
    /**
     * The name of the product for which the stream was created
     * 
     */
    @Export(name="productName", type=String.class, parameters={})
    private Output<String> productName;

    /**
     * @return The name of the product for which the stream was created
     * 
     */
    public Output<String> productName() {
        return this.productName;
    }
    /**
     * Identifies the properties that you want to monitor in the stream. Note that a stream can only log data for active properties.
     * 
     */
    @Export(name="propertyIds", type=List.class, parameters={String.class})
    private Output<List<String>> propertyIds;

    /**
     * @return Identifies the properties that you want to monitor in the stream. Note that a stream can only log data for active properties.
     * 
     */
    public Output<List<String>> propertyIds() {
        return this.propertyIds;
    }
    /**
     * Specify details about the Amazon S3 connector in a stream. When validating this connector, DataStream uses the provided `access_key` and `secret_access_key` values and saves an `akamai_write_test_2147483647.txt` file in your Amazon S3 folder. You can only see this file if validation succeeds, and you have access to the Amazon S3 bucket and folder that you’re trying to send logs to. The argument includes these sub-arguments:
     * 
     */
    @Export(name="s3Connector", type=DatastreamS3Connector.class, parameters={})
    private Output</* @Nullable */ DatastreamS3Connector> s3Connector;

    /**
     * @return Specify details about the Amazon S3 connector in a stream. When validating this connector, DataStream uses the provided `access_key` and `secret_access_key` values and saves an `akamai_write_test_2147483647.txt` file in your Amazon S3 folder. You can only see this file if validation succeeds, and you have access to the Amazon S3 bucket and folder that you’re trying to send logs to. The argument includes these sub-arguments:
     * 
     */
    public Output<Optional<DatastreamS3Connector>> s3Connector() {
        return Codegen.optional(this.s3Connector);
    }
    /**
     * Specify details about the Splunk connector in your stream. Note that currently DataStream supports only endpoint URLs ending with `collector/raw`. The argument includes these sub-arguments:
     * 
     */
    @Export(name="splunkConnector", type=DatastreamSplunkConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamSplunkConnector> splunkConnector;

    /**
     * @return Specify details about the Splunk connector in your stream. Note that currently DataStream supports only endpoint URLs ending with `collector/raw`. The argument includes these sub-arguments:
     * 
     */
    public Output<Optional<DatastreamSplunkConnector>> splunkConnector() {
        return Codegen.optional(this.splunkConnector);
    }
    /**
     * The name of the stream.
     * 
     */
    @Export(name="streamName", type=String.class, parameters={})
    private Output<String> streamName;

    /**
     * @return The name of the stream.
     * 
     */
    public Output<String> streamName() {
        return this.streamName;
    }
    /**
     * The type of stream that you want to create. Currently, `RAW_LOGS` is the only possible stream type.
     * 
     */
    @Export(name="streamType", type=String.class, parameters={})
    private Output<String> streamType;

    /**
     * @return The type of stream that you want to create. Currently, `RAW_LOGS` is the only possible stream type.
     * 
     */
    public Output<String> streamType() {
        return this.streamType;
    }
    /**
     * Identifies the configuration version of the stream
     * 
     */
    @Export(name="streamVersionId", type=Integer.class, parameters={})
    private Output<Integer> streamVersionId;

    /**
     * @return Identifies the configuration version of the stream
     * 
     */
    public Output<Integer> streamVersionId() {
        return this.streamVersionId;
    }
    /**
     * Specify details about the Sumo Logic connector in a stream, including:
     * 
     */
    @Export(name="sumologicConnector", type=DatastreamSumologicConnector.class, parameters={})
    private Output</* @Nullable */ DatastreamSumologicConnector> sumologicConnector;

    /**
     * @return Specify details about the Sumo Logic connector in a stream, including:
     * 
     */
    public Output<Optional<DatastreamSumologicConnector>> sumologicConnector() {
        return Codegen.optional(this.sumologicConnector);
    }
    /**
     * The name of the data set template available for the product that you want to use in the stream. Currently, `EDGE_LOGS` is the only data set template available.
     * 
     */
    @Export(name="templateName", type=String.class, parameters={})
    private Output<String> templateName;

    /**
     * @return The name of the data set template available for the product that you want to use in the stream. Currently, `EDGE_LOGS` is the only data set template available.
     * 
     */
    public Output<String> templateName() {
        return this.templateName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Datastream(String name) {
        this(name, DatastreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Datastream(String name, DatastreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Datastream(String name, DatastreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/datastream:Datastream", name, args == null ? DatastreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Datastream(String name, Output<String> id, @Nullable DatastreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/datastream:Datastream", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Datastream get(String name, Output<String> id, @Nullable DatastreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Datastream(name, id, state, options);
    }
}