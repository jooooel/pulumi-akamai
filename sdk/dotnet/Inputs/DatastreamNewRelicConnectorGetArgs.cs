// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class DatastreamNewRelicConnectorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authToken", required: true)]
        private Input<string>? _authToken;

        /// <summary>
        /// **Secret**. Your Log API token for your account in New Relic.
        /// </summary>
        public Input<string>? AuthToken
        {
            get => _authToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the connector.
        /// </summary>
        [Input("connectorName", required: true)]
        public Input<string> ConnectorName { get; set; } = null!;

        /// <summary>
        /// Content type to pass in the log file header.
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// A human-readable name for the request's custom header, containing only alphanumeric, dash, and underscore characters.
        /// </summary>
        [Input("customHeaderName")]
        public Input<string>? CustomHeaderName { get; set; }

        /// <summary>
        /// The custom header's contents passed with the request that contains information about the client connection.
        /// </summary>
        [Input("customHeaderValue")]
        public Input<string>? CustomHeaderValue { get; set; }

        /// <summary>
        /// The Elasticsearch bulk endpoint URL in the format: `https://&lt;hostname&gt;.elastic-cloud.com:9243/_bulk/`. Set `index_name` in the appropriate field instead of providing it in the URL. You can use Akamaized property hostnames as endpoint URLs. 
        /// &lt;br&gt;Learn more about how to [Stream logs to Elasticsearch](https://techdocs.akamai.com/datastream2/docs/stream-elasticsearch).
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        public DatastreamNewRelicConnectorGetArgs()
        {
        }
        public static new DatastreamNewRelicConnectorGetArgs Empty => new DatastreamNewRelicConnectorGetArgs();
    }
}