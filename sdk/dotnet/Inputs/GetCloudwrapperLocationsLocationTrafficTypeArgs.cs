// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudwrapperLocationsLocationTrafficTypeInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("locationId", required: true)]
        public Input<string> LocationId { get; set; } = null!;

        [Input("trafficType", required: true)]
        public Input<string> TrafficType { get; set; } = null!;

        [Input("trafficTypeId", required: true)]
        public Input<int> TrafficTypeId { get; set; } = null!;

        public GetCloudwrapperLocationsLocationTrafficTypeInputArgs()
        {
        }
        public static new GetCloudwrapperLocationsLocationTrafficTypeInputArgs Empty => new GetCloudwrapperLocationsLocationTrafficTypeInputArgs();
    }
}