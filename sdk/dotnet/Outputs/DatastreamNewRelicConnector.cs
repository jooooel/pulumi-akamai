// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class DatastreamNewRelicConnector
    {
        /// <summary>
        /// **Secret**. Your Log API token for your account in New Relic.
        /// </summary>
        public readonly string AuthToken;
        /// <summary>
        /// The name of the connector.
        /// </summary>
        public readonly string ConnectorName;
        /// <summary>
        /// Content type to pass in the log file header.
        /// </summary>
        public readonly string? ContentType;
        /// <summary>
        /// A human-readable name for the request's custom header, containing only alphanumeric, dash, and underscore characters.
        /// </summary>
        public readonly string? CustomHeaderName;
        /// <summary>
        /// The custom header's contents passed with the request that contains information about the client connection.
        /// </summary>
        public readonly string? CustomHeaderValue;
        /// <summary>
        /// The Elasticsearch bulk endpoint URL in the format: `https://&lt;hostname&gt;.elastic-cloud.com:9243/_bulk/`. Set `index_name` in the appropriate field instead of providing it in the URL. You can use Akamaized property hostnames as endpoint URLs. 
        /// &lt;br&gt;Learn more about how to [Stream logs to Elasticsearch](https://techdocs.akamai.com/datastream2/docs/stream-elasticsearch).
        /// </summary>
        public readonly string Endpoint;

        [OutputConstructor]
        private DatastreamNewRelicConnector(
            string authToken,

            string connectorName,

            string? contentType,

            string? customHeaderName,

            string? customHeaderValue,

            string endpoint)
        {
            AuthToken = authToken;
            ConnectorName = connectorName;
            ContentType = contentType;
            CustomHeaderName = customHeaderName;
            CustomHeaderValue = customHeaderValue;
            Endpoint = endpoint;
        }
    }
}