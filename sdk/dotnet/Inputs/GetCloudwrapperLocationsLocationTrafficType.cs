// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudwrapperLocationsLocationTrafficTypeArgs : global::Pulumi.InvokeArgs
    {
        [Input("locationId", required: true)]
        public string LocationId { get; set; } = null!;

        [Input("trafficType", required: true)]
        public string TrafficType { get; set; } = null!;

        [Input("trafficTypeId", required: true)]
        public int TrafficTypeId { get; set; }

        public GetCloudwrapperLocationsLocationTrafficTypeArgs()
        {
        }
        public static new GetCloudwrapperLocationsLocationTrafficTypeArgs Empty => new GetCloudwrapperLocationsLocationTrafficTypeArgs();
    }
}