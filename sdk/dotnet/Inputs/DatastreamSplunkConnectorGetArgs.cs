// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class DatastreamSplunkConnectorGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables GZIP compression for a log file sent to a destination. If unspecified, this defaults to `true`.
        /// </summary>
        [Input("compressLogs")]
        public Input<bool>? CompressLogs { get; set; }

        [Input("connectorId")]
        public Input<int>? ConnectorId { get; set; }

        /// <summary>
        /// The name of the connector.
        /// </summary>
        [Input("connectorName", required: true)]
        public Input<string> ConnectorName { get; set; } = null!;

        /// <summary>
        /// - (Required) **Secret**. The Event Collector token associated with your Splunk account. See [View usage of Event Collector token in Splunk](https://docs.splunk.com/Documentation/Splunk/8.0.3/Data/UsetheHTTPEventCollector).
        /// </summary>
        [Input("eventCollectorToken", required: true)]
        public Input<string> EventCollectorToken { get; set; } = null!;

        /// <summary>
        /// Enter the secure URL where you want to send and store your logs.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public DatastreamSplunkConnectorGetArgs()
        {
        }
    }
}